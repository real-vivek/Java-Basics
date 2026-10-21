package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to insert value at given index in array
public class ArrayInsertMiddle {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        int insertIndex = 2;
        int value = 10;
        int[] resultArr = new int[arr.length + 1];
        for (int i = 0; i < insertIndex; i++) {
            resultArr[i] = arr[i];
        }
        resultArr[insertIndex] = value;
        for (int i = insertIndex + 1; i < arr.length; i++) {
            resultArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
