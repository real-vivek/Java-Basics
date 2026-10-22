package com.real.vivek.arrays.towD;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SprialMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        // Here increase/deecrease starRow/endRow or startCol/endCol as we iterate over particular row or col 
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; startRow <= endRow && i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;
            for (int i = startRow; startCol <= endCol && i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;
            // Added condition startRow<=endRow as the boundary can become invalid during the current iteration
            // Also we can just have extra condition startRow <= endRow and startCol <= endCol in below 2 loops because the outer loop condition gurantees valid boundaries for above 2 loop
            // However we are chaning the values of startRow and endCol hence the boundary condition can become invalid
            for (int i = endCol; startRow <= endRow && i >= startCol; i--) { 
                result.add(matrix[endRow][i]);
            }
            endRow--;
            for (int i = endRow; startCol <= endCol && i >= startRow; i--) {
                result.add(matrix[i][startCol]);
            }
            startCol++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));
    }
}
