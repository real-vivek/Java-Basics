package com.real.vivek.arrays;

import java.util.Arrays;

//WAP to add 2 numbers which are represented as arrays
public class AddArrays {

    public static void main(String[] args) {
        int[] arr1 = { 9, 9 };
        int[] arr2 = { 9 };
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] resultArr = new int[maxLength];
        int carry = 0;
        int arr1Index = arr1.length - 1;
        int arr2Index = arr2.length - 1;
        int resultArrIndex = resultArr.length - 1;
        while (arr1Index >= 0 || arr2Index >= 0 || carry != 0) {
            int element1 = 0;
            if (arr1Index >= 0) {
                element1 = arr1[arr1Index];
            }
            int element2 = 0;
            if (arr2Index >= 0) {
                element2 = arr2[arr2Index];
            }
            int sum = element1 + element2 + carry;
            if (sum >= 10) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            if (resultArrIndex == -1) {
                resultArr = Arrays.copyOf(resultArr, resultArr.length + 1);
                rotateArrayByOneElement(resultArr);
                resultArr[0] = sum;
            } else {
                resultArr[resultArrIndex] = sum;
            }
            arr1Index--;
            arr2Index--;
            resultArrIndex--;
        }
        System.out.println(Arrays.toString(resultArr));

    }

    public static void rotateArrayByOneElement(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
    }
}
