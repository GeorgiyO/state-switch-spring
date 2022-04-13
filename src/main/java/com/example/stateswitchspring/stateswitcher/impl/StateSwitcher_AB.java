package com.example.stateswitchspring.stateswitcher.impl;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;
import com.example.stateswitchspring.stateswitcher.StateSwitcher;
import org.springframework.stereotype.Component;

@Component
public class StateSwitcher_AB implements StateSwitcher {
  @Override
  public State from() {
    return State.A;
  }

  @Override
  public State to() {
    return State.B;
  }

  @Override
  public void proceed(HasState hasState) {
    System.out.println("StateSwitcher_AB.proceed");
  }
}
