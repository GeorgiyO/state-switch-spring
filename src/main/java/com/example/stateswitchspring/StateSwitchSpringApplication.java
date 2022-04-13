package com.example.stateswitchspring;

import com.example.stateswitchspring.model.Kitty;
import com.example.stateswitchspring.model.State;
import com.example.stateswitchspring.stateswitcher.StateSwitcherComposite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StateSwitchSpringApplication {

  public StateSwitchSpringApplication(StateSwitcherComposite stateSwitcher) {
    var kitty = new Kitty();
    kitty.setState(State.A);
    stateSwitcher.proceed(kitty, State.B);  // StateSwitcher_AB.proceed
    stateSwitcher.proceed(kitty, State.C);  // StateSwitcher_BC.proceed
    stateSwitcher.proceed(kitty, State.A);  // Хуесос ебаный, стейт-свитчер то объяви, мразь
  }

  public static void main(String[] args) {
    SpringApplication.run(StateSwitchSpringApplication.class, args);
  }
}
