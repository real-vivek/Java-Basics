package com.real.vivek.arrays;

//WAP to generate builidng floors for each element in array
public class BuildingFromArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        int height = maxElement;
        // This is similar to how we iterate over 2D array or how we print a pattern
        // Just that here number of rows(height) is maxElement and number of columns is length of array
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= maxElement) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            maxElement--;
            System.out.println();
        }
    }
}
