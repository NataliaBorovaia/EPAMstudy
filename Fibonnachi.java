package com.learning.tasks;
// Fibonacci calculates as
public class Fibonnachi {

    public static void main(String[] args) {
        int N= 15;
        Fibonacci(N);
    }

   public static void Fibonacci(int N)
    {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < N) {
            System.out.println(num1);
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
        }
    }

}
