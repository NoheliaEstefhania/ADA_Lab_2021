package CSES;

/*
 * Ejercicio	: E004
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Rectangle Cutting
 * Date	  		: 29/11/2021
 */

public class E004_Rectangle_Cutting {

	public static void main(String[] args) {

		int a = 5, b = 5;

		System.out.println(solve(a, b));
	}

	// Returns min number of squares needed
	public static int solve(int width, int height) {
		int dp[][] = new int[width + 1][height + 1];

		for (int w = 1; w <= width; w++) {
			for (int h = 1; h <= height; h++) {
				dp[w][h] = 0;
			}
		}
		for (int x = 1; x <= height; x++) {
			dp[x][x] = 0;
		}
		for (int w = 1; w <= width; w++) {
			for (int h = 1; h <= height; h++) {
				for (int i = 1; i < w; i++)
					dp[w][h] = Math.min(dp[w][h], dp[i][h] +  dp[w - i][h]  + 1);
				for (int i = 1; i < h; i++)
					dp[w][h] = Math.min(dp[w][h], dp[w][i]  + dp[h][w - i] + 1);
			}
			return dp[width][height];
		}
		return 0;
	}
}
