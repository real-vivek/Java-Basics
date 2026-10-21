package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to rotate array by 1 element on right side
public class RotateArrayByOne {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        if (arr.length == 1) {
            System.out.println(arr);
        }
        // Approach 1: move elements from right to left
        // int lastElement = arr[arr.length - 1];// storing last element as it will be
        // lost
        // for (int i = arr.length - 1; i > 0; i--) {
        // arr[i] = arr[i - 1];
        // }
        // // After above iteration, we will get 0th element on 1 index as well
        // // Hence placing lastElement at 0th index now
        // arr[0] = lastElement;
        // System.out.println(Arrays.toString(arr));

        // Approach 2: Using intution that we just have to do arr[i+1]=arr[i]
        // If we do arr[i+1]=arr[i], the element at 0th element will be filled in whole array
        // In this approach main issue is value of arr[i+1] is getting lost
        // Hence we need to store value of arr[i+1] as it can be lost
        // Also we need to store lastElement as it will be lost
        int previousElement = arr[0];
        int lastElement = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            arr[i + 1] = previousElement;
            previousElement = temp;
        }
        // After above iteration, we will get 0th element on 1 index as well as we did arr[1]=arr[0]
        // Hence placing lastElement at 0th index now
        arr[0] = lastElement;
        System.out.println(Arrays.toString(arr));
    }
}
