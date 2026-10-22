package com.real.vivek.arrays;

//WAP to find max sum in subarray
public class MaxSumInSubArray {

    public static void main(String[] args) {
        int[] arr = { 4, -2, 3, 1, 0 };

        // Approach 1: Brute force by iterating over saubarray and adding element to check max
        // int maxSum = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     // We define sum as 0 and keep adding elements of subarray to find max
        //     int sum = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum += arr[j];
        //         if (sum > maxSum) {
        //             maxSum = sum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        // Approach 2: Kadane's algorithm: Here if we get sum as -ve we set sum again to 0
        // That is we don't take sum which will eventually decrease our total sum
        int max = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            // Set max value
            if (maxEndingHere > max) {
                max = maxEndingHere;
            }
            // Discard -ve as we don't want any subarray whose overall sum is -ve
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }

        }
        System.out.println(max);

    }
}