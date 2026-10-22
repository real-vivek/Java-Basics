package com.real.vivek.arrays.towD;

import java.util.Arrays;

//WAP to do transpose of matrix
public class TransposeOfMatrix {

    public static void main(String[] args) {
        int mat[][] = new int[][] { { 1, 2, 3, 4, 5 },
                                    { 6, 7, 8, 9, 10 },
                                    { 11, 12, 13, 14, 15 },
                                    { 16, 17, 18, 19, 20 },
                                    { 21, 22, 23, 24, 25 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length ; j++) {
                if (i != j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));

    }
}
