package com.learning.tasks;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 35;
        Check(i);}

        public static void Check(int i){
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
           if (i % 5 == 0) {
               System.out.println("Buzz");
           }
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizz Buzz");
            }

        }
    }