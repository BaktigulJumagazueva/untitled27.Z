package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       UnaryOperator unaryOperator= new UnaryOperator() {
           @Override
           public void sqrt1() {
               System.out.println(Math.sqrt(66.90));
           }
       };
      unaryOperator.sqrt1();
    }
}
   interface UnaryOperator{
        void sqrt1();
       }
