package com.example.stateswitchspring.stateswitcher;

import com.example.stateswitchspring.model.HasState;
import com.example.stateswitchspring.model.State;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface StateSwitcher {
  void proceed(HasState hasState);

  @Target(ElementType.TYPE)
  @Retention(RetentionPolicy.RUNTIME)
  @interface From {
    State value();
  }

  @Target(ElementType.TYPE)
  @Retention(RetentionPolicy.RUNTIME)
  @interface To {
    State value();
  }
}
