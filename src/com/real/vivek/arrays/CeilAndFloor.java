package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to find floor and ceil of target element, given a sorted array
public class CeilAndFloor {

    public static void main(String[] args) {
        int[] arr = { 1, 7, 9, 13, 18, 23, 35 };
        int target = 8;
        int left = 0;
        int right = arr.length - 1;
        // We keep floor at -infinity and ceil at +infinity
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
                floor = mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
                ceil = mid;
            } else {
                // Condition where target exist, hence floor and ceil are equal
                floor = ceil = mid;
                break;
            }
        }
        System.out.println("For target: " + target + " in array: " + Arrays.toString(arr));

        // Considering array with atleast 1 element
        if (ceil != Integer.MAX_VALUE) {
            System.out.println("Ceil: " + arr[ceil]);
        } else {
            System.out.println("Ceil: " + ceil);
        }

        if (floor != Integer.MIN_VALUE) {
            System.out.println("Floor: " + arr[floor]);
        } else {
            System.out.println("Floor: " + floor);

        }
    }

}