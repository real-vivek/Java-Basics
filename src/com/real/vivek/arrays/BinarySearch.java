package com.real.vivek.arrays;

//WAP to find target element given a sorted array
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 11, 14, 19, 28 };
        int target = 18;
        int left = 0;
        int right = arr.length - 1;
        // Unlike conditions we had when reversing array, we have to cover condition left==right
        // If we don't then in some cases, 0th and n-1th place elements are missed by our binary scan
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                System.out.println("Element found at index: " + mid);
                return;
            }
        }
        System.out.println("Target Element Not Found!");
    }

}