package com.example.stateswitchspring.model;

public class Kitty implements HasState {
  State state;

  @Override
  public State getState() {
    return state;
  }

  @Override
  public void setState(State state) {
    this.state = state;
  }
}
