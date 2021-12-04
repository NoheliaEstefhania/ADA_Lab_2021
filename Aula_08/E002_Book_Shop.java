package Aula_08;

import java.util.*;

/*
 * Ejercicio	: E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Book Shop
 * Date	  		: 29/11/2021
 */

public class E002_Book_Shop {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in); 
		int n, M;
		int [] price = {0,4,8,5,3};
		int [] pages = {0,5,12,8,1};
		int [][] matriz;
		n = 4; //cantidad de libros
		M = 10; //dinero total disponible
		matriz = bookShop(n, M, price, pages);
		print(matriz);
		System.out.println("\n El valor máximo a obtener es : " + matriz[n][M]);
	}

	public static void print(int[][] a) {
		System.out.println("\n\t\t\t\t*****BOOK SHOP*****\n");
		System.out.println("       0        1       2      3       4       5       6       7       8       9       10");

		for (int i = 0; i < a.length; i++) {
			System.out.println("   ------------------------------------------------------------------------------------------");

			System.out.print((i+1) + "  |   ");
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] <= 9) {
					System.out.print(a[i][j] + "  " + "  |  ");
				}
				else {
					System.out.print(a[i][j] + "  " + " |  ");
				}
			}
			System.out.println();
		}
		System.out.println("   ------------------------------------------------------------------------------------------");

	}
	
	//Programación dinámica - algoritmo de la mochila
	public static int[][] bookShop( int n, int M, int []W, int []C) {
		int [][] B = new int [n+1] [M+1]; //creamos la matriz 
		int w;
		for(int i=0; i<=n; i++)//inicializamos la primera fila
			B[i][0] = 0;
		for(int i=0; i<=M; i++) //inicializamos la primera columna
			B[0][i] = 0;
		for(int i=1; i<=n; i++)//a partir la la fila y columna 1 vamos hallando los respectivos valores
			for(w=1; w<=M; w++)
				if( w - W[i] < 0 )
					B[i][w] = B[i-1][w];
				else
					if( B[i-1][w] > (C[i] + B[i-1][w-W[i]]) )
						B[i][w] = B[i-1][w];
					else
						B[i][w] = C[i] + B[i-1][w-W[i]];
		return B; //valor máximo en la posición [i][w] de mi celda , considerendo los i primeros objetos
	}
	/* w: peso de mi mochila en ese momento
	 * W[i]: volumen de mi i-ésimo elemento
	 * c[i]: pageso del i-ésimo elem.
	 * B[i-1][w-W[i]]: el pages de mi mochila quitando el i-ésimo elemento
	 * w - W[i]: para determinar si el i-ésimo elemento podría cver en la mochila
	 * -------------------------------------------------------------------------------------------------
	 * int [][]B : matriz de beneficios con valores
	 * B[i][k]: la primera vez que entremos representará la máxima cantidad de la mochila
	 * 
	 */
}