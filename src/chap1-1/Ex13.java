/*
 * @Author: batkiz 
 * @Date: 2018-08-04 19:11:20 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 19:35:18
 */

/**
 * Ex13
 */
public class Ex13 {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 100, 200, 300 }, { 400, 500, 600 } };
        printMatrix(a);
    }
}