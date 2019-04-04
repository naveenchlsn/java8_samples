package com.lambdas.example;
import java.util.*;
import java.util.stream.*;

class Functional04 {
  public static void main(String[] args) {           
    
    //Imperative: what and how.    
    //Declarative: what not how

    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    //find the total of sqrt of even numbers

    //Imperative:
    double result = 0;       
    
    for(int e : numbers) {
      if(e % 2 == 0) {
        result += Math.sqrt(e);
      }
    }
    
    System.out.println(result);
    

    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0) //functional (and declarative)
        .mapToDouble(Math::sqrt)  //functional (and declarative) // Intermediate collections are not created.  // Executed when it seeds the function sum.
        .sum());
  }
}


