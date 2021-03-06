package com.greenfoxacademy.controller;

import com.greenfoxacademy.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    //fox.setName("Mr. Green");
    //fox.setFood("salad");
    //fox.setDrink("water");
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore(Model model) {
    model.addAttribute("fox", fox);
    return "nutritionStore";
  }

  @RequestMapping("/changefood")
  public String changeFood(@RequestParam("food") String food, @RequestParam("drink") String drink) throws Exception {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping("/trickCenter")
  public String trickCenter(Model model) {
    model.addAttribute("fox", fox);
    return "trickCenter";
  }

  @RequestMapping("/addtrick")
  public String addTrick(@RequestParam("tricks") String tricks) throws Exception {
    fox.getTricks();
    return "redirect:/";
  }
}
