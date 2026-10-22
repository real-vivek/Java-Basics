package com.real.vivek.arrays;

//WAP to print all subarrays
public class PrintAllSubArrays {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 1, 0 };
        // We first write all the subarrays and  see that we will require 3 loops
        // 1st to get starting index of subarray
        // 2nd to get ending index of subarray
        // 3rd to print the subarray from si to ei
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();

            }
        }
    }
}