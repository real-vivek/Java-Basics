package com.real.vivek.arrays.towD;

import java.util.Arrays;

//WAP to multiply 2 matrices
public class MultiplyMatrices {

    public static void main(String[] args) {
        int[][] mat1 = { { 1, 5 ,3}, { 3, 4 ,-1} };
        int[][] mat2 = { { 4, 3 }, { 2, 1 }, {10,7} };

        // Approach 1: If we want result in ArrayList and matrices are of same size
        // ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // for (int row = 0; row < mat1.length; row++) {
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int k = 0; k < mat2.length; k++) {
        // int sum = 0;
        // for (int col = 0; col < mat2[0].length; col++) {
        // sum = sum + mat1[row][col] * mat2[col][k];
        // }
        // al.add(sum);
        // }
        // result.add(al);
        // }
        // System.out.println(result);

        // Approach 2: If we want result in array and matrix length and we don't have n*n matrix
        int result[][] = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {// i pointer for iterating over all rows of mat1
            for (int j = 0; j < mat2[0].length; j++) {// j pointer for iterating over all columns of mat2
                int sum = 0;
                for (int k = 0; k < mat1[0].length; k++) {//k pointer so that each row(inner array) in mat1 is multiplied with every col on mat2
                    sum = sum + mat1[i][k] * mat2[k][j];
                }
                result[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}