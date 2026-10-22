package com.real.vivek.arrays.towD;

//WAP to traverse matrix in wave format
public class WaveTraversal {

    public static void main(String[] args) {
        int mat[][] = new int[][] { { 1, 2, 3, 4 },
                                    { 5, 6, 7, 8 },
                                    { 9, 10, 11, 12 } };
        for (int i = 0; i < mat[0].length; i++) {
            if (i % 2 == 0) { // For even numbers, we have to travel from 0 to n-1
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[j][i] + ", ");
                }
            } else { // For odd numbers, we have to travel from n-1 to 0
                for (int j = mat.length - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + ", ");
                }
            }
            System.out.println();
        }

    }
}
