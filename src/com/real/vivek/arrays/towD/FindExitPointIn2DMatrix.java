package com.real.vivek.arrays.towD;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1
public class FindExitPointIn2DMatrix {

    public List<Integer> exitPoint(int[][] mat) {
        int direction = 0;
        int row = 0;
        int col = 0;
        while (row >= 0 && col >= 0 && row < mat.length && col < mat[0].length) {
            if (mat[row][col] == 1) {
                direction++;
                direction = direction % 4;// if direction becomes greater than 3 we again reset it to 0
                mat[row][col] = 0; // because of condition give in question: If the current cell contains 1, change your direction to the right (clockwise turn), 
                // and update the cell value to 0.
            }
            // Simulate moving right
            if (direction == 0) {
                col++;
            } else if (direction == 1) { // Simulate moving downwards
                row++;
            } else if (direction == 2) { // Simulate moving left
                col--;
            } else { // Simulate moving upwards
                row--;
            }
        }
        // We have come out of matrix hence we adjust for it
        if (direction == 0) {
            col--;
        } else if (direction == 1) {
            row--;
        } else if (direction == 2) {
            col++;
        } else {
            row++;
        }
        return new ArrayList<>(List.of(row, col));
    }

}