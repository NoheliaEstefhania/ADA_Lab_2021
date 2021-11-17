package Graphs;

/*
 * Ejercicio - E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description		: Graphs
 * Date	  		: 08/11/2020
 */

public class E002_DFS_ColordBoard{
	public static void main (String[]args){
		String [][] matriz = new String [6][6];
		inicializar(matriz);
		print(matriz);
	}

	public static void inicializar(String [][] matriz){
		int x = matriz.length;
	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < x; j++) {
	          if(i == 0 || j == 0 || i == x-1 || j == x-1 ){
	        	  matriz[i][j] = "#";
	          }
	          else {
	        	  matriz[i][j] = "0";
	          }
	        }
	      }
	    matriz[x-1][x-1] = "0";
	    matriz[x-2][x-3] = "0";
	    matriz[x-2][x-1] = "0";
	    matriz[x-2][x-2] = "#";
	    }
	// Imprimme la matriz
	public static void print(String [][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
		}
		System.out.println();
	}

}
