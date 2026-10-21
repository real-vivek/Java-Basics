package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to rotate array by k times
public class RotateArrayKTimes {

    public static void main(String[] args) {
        int[] arr = { 5, 9, 7, 6, 11, 2 };
        if (arr.length == 1) {
            System.out.println(arr);
        }
        int k = 2;
        // Rotating array arr.length+2 times is same as rotating array 2 times
        k = k % arr.length;
        // Rotating k -ve times is same as rotating k arr.length+k times
        if (k < 0) {
            k = arr.length + k;
        }

        // We divide array in 2 parts: PartA: 0 to len-k-1,PartB: len-k to len
        // Step 1: Rotate whole array, from here we see that rotating the PartA and
        // PartB will give us result
        rotateArray(arr, 0, arr.length - 1);
        // Step 2: Rotating part A(Here now PartA will be from 0 to k-1)
        rotateArray(arr, 0, k - 1);
        // Step 3: Rotating part B(Here now PartA will be from k to len)
        rotateArray(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int left, int right) {
        // We can use left<=right just that middle element in case of odd length will be roatated twice
        // In case of even element we don't get left==right as we do left++ and right--
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
