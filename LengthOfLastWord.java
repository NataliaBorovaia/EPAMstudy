package com.learning.tasks;

public class LengthOfLastWord {

    public static void main(String args[])
    {
        String s="My name is Sammy";
        System.out.println(s);
        System.out.println("Length of the last word is: "+length(s));
    }
    public static int length(String s)
    {
        int n=s.length();
        int s1;
        int s2;

        s1=0;
        while(s1< n && s.charAt(s1)==' ') s1++;

        s2=n-1;
        while(s2 >=0 && s.charAt(s2)==' ') s2--;

        int pos=s2;
        while(pos>=s1)
        {
            if(s.charAt(pos)==' ') return s2-pos;
            else pos--;
        }

        return s2-pos;
    }
}
