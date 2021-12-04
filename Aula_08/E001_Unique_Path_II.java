package Aula_08;

import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Unique Path II
 * Date	  		: 29/11/2021
 */

public class E001_Unique_Path_II {
	public static void main(String args[]) {
		int[][] obstacleGrid = { { 0, 0, 0 }, 
								{ 0, 1, 0 }, 
								{ 0, 0, 0 } };
		System.out.println("Input : ");	
		print(obstacleGrid);	
		System.out.println("\nOutput : " + uniquePathsII(obstacleGrid));
		
	}

	//Devuelve el total de caminos posibles para llegar al extremo inferior derecho
	
	public static int uniquePathsII(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        
        int[][] paths = new int[height][width];
        
        // primera columna
        for (int i = 0; i < height; i++) {
            if (obstacleGrid[i][0] != 1) {
                paths[i][0] = 1;
            } else {
                break;
            }
        }
        
        // primera fila
        for (int j = 0; j < width; j++) {
            if (obstacleGrid[0][j] != 1) {
                paths[0][j] = 1;
            } else {
                break;
            }
        }
        
        // espacios diferentes a la primera fila o columna
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (obstacleGrid[i][j] != 1) {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }                
            }
        }
        
        return paths[height - 1][width - 1];
    }
	
	//imprime la obstacleGrid de listas
	
	public static void print(int [][] obstacleGrid){
		for (int i = 0; i < obstacleGrid.length; i++) {
			System.out.println();
			for (int j = 0; j < obstacleGrid[i].length; j++) {
				System.out.print(" " + obstacleGrid[i][j]);
			}
		}
		System.out.println();
	}
}
