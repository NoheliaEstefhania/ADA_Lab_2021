package Aula_08;

import java.util.Scanner;

/*
 * Ejercicio	: E005
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Maximal Square
 * Date	  		: 29/11/2021
 */

public class E005_Maximal_Square {
	public static void main(String[] args) {
		char matrix [][]  = {{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}};
		
		System.out.println(maximalSquare(matrix));
	}
	
    public static int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];
        int max = 0; 
        int prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    max = Math.max(max, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return (int) Math.pow(max, 2);
    }
}