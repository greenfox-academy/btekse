package com.greenfoxacademy.doubling;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class Doubling {
  int received;
  int result;

  public Doubling() {
  }

  public Doubling(int received) {
    this.received = received;
    this.result = 2 * received;
  }

  public int getReceived(){
    return result;
  }

  public int getResult(){
    return received;
  }
}
