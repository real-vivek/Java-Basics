package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to reverse given array
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        // Approach 1: Using for-loop
        // Be careful here that we use i< arr.length/2 if not we get inncorrect ans
        // For even length, the middle 2 elements are reversed twice(hence they are as
        // is)
        // for (int i = 0; i < arr.length / 2; i++) {
        // int temp = arr[i];
        // arr[i] = arr[arr.length - 1 - i];
        // arr[arr.length - 1 - i] = temp;
        // }
        // System.out.println(Arrays.toString(arr));

        // Approach 2: Using while loop and pointers(mostly used)
        // This approach is mostly used as we can give custom values of left and right
        // Thus selectively rotating part of array
        int left = 0;
        int right = arr.length - 1;
        // We can use left<=right just that middle element in case of odd length will be roatated twice
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
