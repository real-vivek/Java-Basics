package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to find first and last occurance of target element, given a sorted array
public class FirstAndLastOccurance {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 5, 5, 5, 5, 8, 11, 13, 13, 19, 19, 19 };
        int target = 5;

        int firstOccuranceIndex = firstOccurance(arr, target);
        if (firstOccuranceIndex == -1) {
            System.out.println("Target Element Not found!");
            return;
        }
        int lastOccuranceIndex = lastOccurance(arr, target);
        if (firstOccuranceIndex == lastOccuranceIndex) {
            System.out.println("Only occurrance for target element is at index: " + firstOccuranceIndex);
        } else {
            System.out.println("For target: " + target + " in array: " + Arrays.toString(arr));
            System.out.println("First Occurrance: " + firstOccuranceIndex);
            System.out.println("Last Occurrance: " + lastOccuranceIndex);
        }

    }

    public static int firstOccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstOccuranceIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                firstOccuranceIndex = mid;
                // Even when we found target, we move right pointer to mid-1 to find firstOccurance if any
                right = mid - 1;
            }
        }
        return firstOccuranceIndex;
    }

    public static int lastOccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastOccuranceIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                lastOccuranceIndex = mid;
                // Even when we found target, we move left pointer to mid+1 to find lastOccurance if any
                left = mid + 1;
            }
        }
        return lastOccuranceIndex;
    }

}