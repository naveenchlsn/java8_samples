package com.lambdas.example;
import java.util.*;


// Inherent Complexity.
// Mutating is error prone.
// Hard to reason. More state chang we have.
// Structure of code is very different from concurrent and single threaded code.
class AssignmentLess {
  public static void main(String[] args) {           
    //goto is to structured programming as assignment is to functional programming
    
    for(int i = 0; i < 10; i++) {
      if(i > 5) {
        System.out.println(i);
      }
    }                       
    
    //Compile. Then use javap -c Sampl e to view the bytecode. Notice goto.
    //We are not allowed to use goto, but there is goto under the hood.
    //Likewise, FP discourages us from using assignment, but there may be assignments in layers below.
  }
}


