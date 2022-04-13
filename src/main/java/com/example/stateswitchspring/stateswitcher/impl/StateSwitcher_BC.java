package com.example.stateswitchspring.stateswitcher.impl;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;
import com.example.stateswitchspring.stateswitcher.StateSwitcher;
import com.example.stateswitchspring.stateswitcher.StateSwitcher.From;
import com.example.stateswitchspring.stateswitcher.StateSwitcher.To;
import org.springframework.stereotype.Component;

@Component
@From(State.B)
@To(State.C)
public class StateSwitcher_BC implements StateSwitcher {
  @Override
  public void proceed(HasState hasState) {
    System.out.println("StateSwitcher_BC.proceed");
  }
}
