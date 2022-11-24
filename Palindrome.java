package com.learning.tasks;

public class Palindrome {
    public static void main(String[] args) {
        int num = 89079098;
        int reverseNum = 0;
        int odd;

        System.out.println(num);
        int originalNum = num;
        while (num != 0) {
            odd = num % 10;
            reverseNum = reverseNum * 10 + odd;
            num /= 10;
        }

        if (originalNum == reverseNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}



