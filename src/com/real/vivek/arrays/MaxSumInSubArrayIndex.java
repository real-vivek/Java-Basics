package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to print subarray whose sum is max
public class MaxSumInSubArrayIndex {

    public static void main(String[] args) {
        int[] arr = { 4, -2, 3, 1, 0 };

        // Approach 1: Brute force by iterating over saubarray and adding element to check max
        // When we find max, at that time itself, we evaluate values of starting and ending indices of subarray
        // int maxSum = Integer.MIN_VALUE;
        // int startingIndex = -1;
        // int endingIndex = -1;
        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum > maxSum) {
        // startingIndex = i;
        // endingIndex = j;
        // maxSum = sum;
        // }
        // }
        // }
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, startingIndex, endingIndex + 1)));

        // Approach 2: Kadane's algorithm: Here if we get sum as -ve we set sum again to 0
        // When we set sum to 0, we are starting subarray from next iteration, hence we set tempStarting to i+1
        // And when we find max value, we have to update endingIndex to i and startingIndex to tempStarting 
        int max = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        int endingIndex = 0;
        int startingIndex = 0;
        int tempStartingIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            // Once we find max, we update values of startingIndex and endingIndex
            if (maxEndingHere > max) {
                max = maxEndingHere;
                endingIndex = i;
                startingIndex = tempStartingIndex;
            }
            // Set tempStartingIndex to i+1 as we are evaluating new subarray from next index which may be max subarray
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                tempStartingIndex = i + 1;
            }

        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, startingIndex, endingIndex + 1)));

    }
}