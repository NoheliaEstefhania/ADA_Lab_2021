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
		int nlibros, disponible;
		int [] price = {4,8,5,3};
		int [] pages = {5,12,8,1};
		int [][] matriz;
		nlibros = 4; //cantidad de libros
		disponible = 10; //dinero total disponible
		matriz = bookShop(nlibros, disponible, price, pages);
		print(matriz);
		System.out.println("Input : ");
		for (int i=0; i<price.length; i++) {
			System.out.print(price[i] + " ");
		}
		System.out.print("\n");
		
		for (int i=0; i<pages.length; i++) {
			System.out.print(pages[i] + " ");
		}
		System.out.println("\nOutput : " + matriz[nlibros][disponible]);
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
	public static int[][] bookShop(int n, int M, int []price, int []pages) {
		int [][] B = new int [n+1] [M+1];  
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j <= M; j++) { 
				B[i + 1][j] = B[i][j];
				if(price[i]<=j){ 
					B[i+1][j] = Math.max(B[i+1][j], B[i][j-price[i]] + pages[i]); 
				} 
			} 
		}
		return B;
	}
}