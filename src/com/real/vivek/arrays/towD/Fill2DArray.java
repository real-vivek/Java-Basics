package com.real.vivek.arrays.towD;

import java.util.Arrays;

//WAP to create and fill a 2D array
public class Fill2DArray {

    public static void main(String[] args) {
        int[][] mat = new int[3][4];// 3 rows and 4 columns
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                mat[row][col] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
}