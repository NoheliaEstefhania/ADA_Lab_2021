package Aula_03;

import java.util.Scanner;
/*
 * Ejercicio - E001
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Busqueda Binaria Timer
 * Date	  : 27/09/2020
 */
public class E002_BusquedaBinariaGraph {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int searched;
		int n = 10;
		int [] nums=new int[n];	 
		while (n <= 100000000) {
			int[] array = crearArray(n);
			System.out.println("\ncantidad de elementos en el array " + n);
			timer(array, n - 1);
			n = n * 10;

		}	
		 
	}
	private static int[] crearArray(int n) {
		int x = 0;
		int[] array = new int[n];
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = x;
			x = x + 2;
		}

		return array;
	}
	private static int busquedaBinaria(int[]nums, int searched1) {
		int alta, baja, media;
		baja=0;
		alta=(nums.length-1);
		while(baja<=alta) {
			media=(alta+baja)/2;
			if (nums[media]==searched1) {
				return media;	      
			}else 
				if (nums[media]>searched1) {
					alta=media-1;

				}else { 
					baja=media+1;					 			
				}			 			
		}
		return -1;
	}
	private static void timer(int array[], int searched) {
		int position;
		double inicio = System.nanoTime();
		System.out.println("¿ Se encuentra el número " + searched + " ? " );
		position=busquedaBinaria(array, searched);
		if (position==-1) 
			System.out.println("No se encontró");		      
		else
			System.out.println("La posicion de " + searched + " es: " + position);
		double fin = System.nanoTime();
		System.out.println("Se demoro: " + (fin - inicio) + " nanosegundos");
	}
}