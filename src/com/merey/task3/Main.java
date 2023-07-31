package com.merey.task3;

import com.merey.task3.methods.Reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(Reverse.reverse(str));
    }
}