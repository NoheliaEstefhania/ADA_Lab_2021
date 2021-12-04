package Aula_08;

import java.util.Scanner;

/*
 * Ejercicio	: E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Maximal Square
 * Date	  		: 29/11/2021
 */

public class E005_Maximal_Square {
	public static void main(String[] args) {
		char matriz [][]  = {{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}};
		
		System.out.println(maximalSquare(matriz));
	}
	
    public static int maximalSquare(char[][] matriz) {
        int rows = matriz.length, cols = rows > 0 ? matriz[0].length : 0;
        int[] dp = new int[cols + 1];
        int max = 0, prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matriz[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    max = Math.max(max, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return max * max;
    }
}