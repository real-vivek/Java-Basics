package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to find inverse of array
public class InverseOfArray {

    public static void main(String[] args) {
                    // 0, 1, 2 ,3, 4
        int[] arr = { 4, 2, 3, 1, 0 };
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]] = i;
        }
        System.out.println(Arrays.toString(res));
    }
}