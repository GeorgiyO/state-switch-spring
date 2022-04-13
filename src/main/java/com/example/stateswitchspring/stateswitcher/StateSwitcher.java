package com.example.stateswitchspring.stateswitcher;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;

public interface StateSwitcher {
  State from();
  State to();
  void proceed(HasState hasState);
}
