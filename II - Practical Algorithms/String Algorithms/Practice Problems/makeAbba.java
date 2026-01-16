public class makeAbba {
    public static String method1(String a, String b) {
        // Given two strings, a and b, return the result of putting them 
        // together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        return "";
    }

    public static void main(String[] args) {
        method1("Hi", "Bye"); // → "HiByeByeHi"
        method1("Yo", "Alice"); // → "YoAliceAliceYo"
        method1("What", "Up"); // → "WhatUpUpWhat"
    }
}