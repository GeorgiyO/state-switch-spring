package com.example.stateswitchspring.stateswitcher.impl;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;
import com.example.stateswitchspring.stateswitcher.StateSwitcher;
import org.springframework.stereotype.Component;

@Component
public class StateSwitcher_BC implements StateSwitcher {
  @Override
  public State from() {
    return State.B;
  }

  @Override
  public State to() {
    return State.C;
  }

  @Override
  public void proceed(HasState hasState) {
    System.out.println("StateSwitcher_BC.proceed");
  }
}
