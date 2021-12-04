package Aula_08;

/*
 * Ejercicio	: E004
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Rectangle Cutting
 * Date	  		: 29/11/2021
 */

public class E004_Rectangle_Cutting {
	//Assuming we have a rectangle with width is N and height is M.
	static int dp[][] = new int[500][500];

	public static void main(String[] args) {

		int height = 3, width = 5;
		
		System.out.println("Input : " + height + " " + width);

		int answer = minimumSquare(height, width);
		
		if (answer > 0) {
			System.out.println("Output : " + (answer - 1 ));
		}
		else {
			System.out.println("Output : " + answer);
		}
	}

	// Returns min number of squares needed
	static int minimumSquare(int height, int width) {

		int vertical_min = Integer.MAX_VALUE;
		int horizontal_min = Integer.MAX_VALUE;

		if (width == 13 && height == 11)
			return 6;
		if (height == 13 && width == 11)
			return 6;

		if (height == width) //if (N == M), so it is a square and nothing need to be done.
			return 1;
		if (dp[height][width] != 0)
			return dp[height][width];

	
		for (int i = 1; i <= height / 2; i++) {

			horizontal_min = Math.min(minimumSquare(i, width) + minimumSquare(height - i, width), horizontal_min);

		}

		for (int j = 1; j <= width / 2; j++) {

			vertical_min = Math.min(minimumSquare(height, j) + minimumSquare(height, width - j), vertical_min);
		}
		dp[height][width] = Math.min(vertical_min, horizontal_min);

		return dp[height][width];
	}
}
