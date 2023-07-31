package com.merey.sum;

import java.util.Arrays;

public class MathFunctions {
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; ++i){
            sum += arr[i];
        }
        return sum;
    }

    public int max(int[] arr){
        int mx = arr[0];
        for (int i = 0; i < arr.length; ++i){
            mx = Math.max(mx, arr[i]);
        }
        return mx;
    }

    public int min(int[] arr){
        int mn = arr[0];
        for (int i = 0; i < arr.length; ++i){
            mn = Math.min(mn, arr[i]);
        }
        return mn;
    }

    public int avr(int[] arr) {
        return sum(arr) / arr.length;
    }

    public int med(int[] arr) {
        return (max(arr) + min(arr)) / 2;
    }
}
