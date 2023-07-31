package com.merey.task3.methods;

public class Reverse {
    public static String reverse(String str) {
        String r = new StringBuffer(str).reverse().toString();
        return r;
    }
}
