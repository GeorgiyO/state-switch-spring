package com.example.stateswitchspring.model;

public interface HasState {
  State getState();
  void setState(State state);
}
