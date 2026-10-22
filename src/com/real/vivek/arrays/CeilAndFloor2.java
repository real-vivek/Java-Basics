package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to find floor and ceil of target element, given a sorted array
//If there are multiple floors, find index of floor which occurs last
//If there are multiple ceil, find index of ceil which occurs first
public class CeilAndFloor2 {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 5, 5, 5, 5, 8, 11, 13, 13, 19, 19, 19 };
        int target = 5;

        int lastFloorIndex = findLastFloor(arr, target);
        int firstCeilIndex = findFirstCeil(arr, target);
        System.out.println("For target: " + target + " in array: " + Arrays.toString(arr));
        System.out.println("Last Floor value is: " + lastFloorIndex);
        System.out.println("First Ceil value is: " + firstCeilIndex);

    }

    public static int findLastFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = Integer.MIN_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target >= arr[mid]) { // Even if we find target(floor), move left pointer to mid+1 to find last occurance of floor
                floor = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return floor;
    }

    public static int findFirstCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ceil = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target <= arr[mid]) { // Even if we find target(ceil), move right pointer to mid-1 to find first occurance of ceil
                ceil = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ceil;
    }

}