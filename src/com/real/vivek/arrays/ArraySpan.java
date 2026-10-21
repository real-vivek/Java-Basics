package com.real.vivek.arrays;

//WAP to find span of an array
//Span of array is the difference between largest and smallest element
public class ArraySpan {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        // Here we assign smallestElement to MAX_VALUE and largest to MIN_VALUE
        // We often see this pattern when we need to find largest or smallest element
        int smallestElement = Integer.MAX_VALUE;
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        System.out.println("Span is: " + (largestElement - smallestElement));

    }
}
