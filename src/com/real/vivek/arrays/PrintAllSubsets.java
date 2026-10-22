package com.real.vivek.arrays;

//WAP to print all subsets of given array
public class PrintAllSubsets {

    public static void main(String[] args) {
        int[] arr = { 4, 2, -1 };
        int len = arr.length;
        // Here each element in array has 2 option either to be present or absent
        // Hence the total number of iterations will be 2^n(from 0 to (2^n)-1 in binary)where n is len of array
        int maxTimes = Math.powExact(2, len);
        for (int i = 0; i < maxTimes; i++) {
            int num = i;
            String subArray = "";
            // Iterating from right to left as we to have values values in order from 000 to 111
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = num % 2;
                if (rem == 0) {
                    subArray = "_, " + subArray;
                } else {
                    subArray = arr[j] + ", " + subArray;
                }
                num = num / 2;
            }
            System.out.println(subArray);
        }
    }
}