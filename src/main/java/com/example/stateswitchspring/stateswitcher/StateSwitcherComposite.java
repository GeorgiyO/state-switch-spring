package com.example.stateswitchspring.stateswitcher;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;

public interface StateSwitcherComposite {
  void proceed(HasState target, State newState);
}
