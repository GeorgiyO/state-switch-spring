package com.example.stateswitchspring.stateswitcher.impl;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;
import com.example.stateswitchspring.stateswitcher.StateSwitcher;
import com.example.stateswitchspring.stateswitcher.StateSwitcherComposite;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class StateSwitcherCompositeImpl implements StateSwitcherComposite {

  Map<State, Map<State, StateSwitcher>> switchers = new HashMap<>();

  public StateSwitcherCompositeImpl(List<StateSwitcher> switchers) {
    switchers.forEach(sw -> {
      this.switchers.putIfAbsent(sw.from(), new HashMap<>());
      var map = this.switchers.get(sw.from());
      map.put(sw.to(), sw);
    });
  }

  @Override
  public void proceed(HasState target, State newState) {
    Optional.ofNullable(switchers.get(target.getState()))
            .map(map -> map.get(newState))
            .ifPresentOrElse(
              sw -> {
                sw.proceed(target);
                target.setState(newState);
              },
              () -> System.out.println("Хуесос ебаный, стейт-свитчер то объяви, мразь")
            );
  }
}
