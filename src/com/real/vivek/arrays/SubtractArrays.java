package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to subtract 2 numbers which are represented as arrays
//The first number is greater than the second element
public class SubtractArrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 0, 0 };
        int[] arr2 = { 9 };
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] resultArr = new int[maxLength];
        int borrow = 0;
        int arr1Index = arr1.length - 1;
        int arr2Index = arr2.length - 1;
        int resultArrIndex = resultArr.length - 1;
        while (arr1Index >= 0 || arr2Index >= 0) {
            int element1 = 0;
            if (arr1Index >= 0) {
                element1 = arr1[arr1Index];
            }
            int element2 = 0;
            if (arr2Index >= 0) {
                element2 = arr2[arr2Index];
            }
            element1 = element1 - borrow;
            if (element1 < element2) {
                element1 = element1 + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            resultArr[resultArrIndex] = element1 - element2;
            arr1Index--;
            arr2Index--;
            resultArrIndex--;
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
