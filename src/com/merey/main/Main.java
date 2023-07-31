package com.merey.main;

import com.merey.sum.MathFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = scn.nextInt();
        }
        System.out.println(mathFunctions.sum(a));
        System.out.println(mathFunctions.max(a));
        System.out.println(mathFunctions.min(a));
        System.out.println(mathFunctions.avr(a));
        System.out.println(mathFunctions.med(a));
    }
}