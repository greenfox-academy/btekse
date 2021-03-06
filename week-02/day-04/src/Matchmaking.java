/**
 * Created by Balázs on 2017. 03. 23..
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    // Lists#2
    // Join the two lists by matching one girl with one boy in the order list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    for (int i = 0; i < girls.size() * 2; i+=2) {
      order.add(i, girls.get(i / 2));
      order.add(i + 1, boys.get(i / 2));
    }
    System.out.println(order);
  }
}
