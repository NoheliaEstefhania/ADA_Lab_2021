package Graphs;

/*
 * Ejercicio - E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Graphs
 * Date	  		: 08/11/2020
 */

public class E002_DFS_ColordBoard{
	public static void main (String[]args){
		String [][] matriz = new String [6][6];
		inicializar(matriz);
		print(matriz);
	}

	// Metodo para inicializacion de los valores de la tabla
	public static void inicializar(String [][] matriz){
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz.length; j++) {
	          if(i == 0 || j == 0 || i == 5 || j == 5 ){
	        	  matriz[i][j] = "#";
	          }
	          else {
	        	  matriz[i][j] = "0";
	          }
	        }
	      }
	    matriz[5][5] = "0";
	    matriz[5][4] = "0";
	    matriz[4][5] = "0";
	    matriz[4][4] = "#";
	    }
	// Imprimiendo la tabla
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