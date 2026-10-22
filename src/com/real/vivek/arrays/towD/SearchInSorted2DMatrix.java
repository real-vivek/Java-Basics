package com.real.vivek.arrays.towD;

//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchInSorted2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // We start from [0,n-1] element in matrix because we can go left or down by comparing with target element
        // We do down if target>element because elemnt at 0,n-1 is largest in row hence we have compared with all elements in that row
        // Similarly if target<element, we do left because element at 0,n-1 is smalles in col hence we have compared with all elements in that col
        // Also we can also start from [n-1,0] element in matrix and go right or up by comparing where we will have condition row >= 0 && col < matrix[0].length
        int row = 0;
        int col = matrix[0].length - 1;
        boolean found = false;
        while (row < matrix.length && col >= 0) {
            int element = matrix[row][col];
            if (target < element) {
                col--;
            } else if (target > element) {
                row++;
            } else {
                found = true;
                break;
            }

        }
        return found;
    }
}
