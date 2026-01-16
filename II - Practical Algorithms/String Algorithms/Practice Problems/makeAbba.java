public class makeAbba {
    public static String method1(String a, String b) {
        // Given two strings, a and b, return the result of putting them 
        // together in the order a b b a, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        return a + b + b + a;
    }

    public static void main(String[] args) {
        System.out.println(method1("Hi", "Bye")); // → "HiByeByeHi"
        System.out.println(method1("Yo", "Alice")); // → "YoAliceAliceYo"
        System.out.println(method1("What", "Up")); // → "WhatUpUpWhat"
    }
}