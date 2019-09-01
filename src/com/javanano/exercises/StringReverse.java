package com.javanano.exercises;

public class StringReverse {

    public static String reverseString(String s) {
        StringBuilder sReversed = new StringBuilder(s);
        sReversed = sReversed.reverse();
        return sReversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
}
