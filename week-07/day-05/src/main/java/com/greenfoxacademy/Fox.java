package com.greenfoxacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {
  private String name = "Mr. Fox";
  private String food;
  private String drink;
  private List<String> tricks = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void addTricks(List<String> tricks) {
    this.tricks = tricks;
  }
}
