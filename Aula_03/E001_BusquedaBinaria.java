package Aula_03;

import java.util.Scanner;
/*
 * Ejercicio - E001
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Busqueda Binaria
 * Date	  : 27/09/2020
 */
public class E001_BusquedaBinaria {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int searched, position;
		int n = 10;
		int [] nums=new int[n];	 
		while (n <= 100000000) {
			int[] array = crearArray(n);
			System.out.println("\ncantidad de elementos en el array " + n);
			timer(array, n - 1);
			n = n * 10;

		}	
		System.out.println("Ingrese el número que esté buscando:");
		searched=s.nextInt();
		position=busquedaBinaria(nums, searched);
		if (position==-1) 
			System.out.println("No se encontró");		      
		else
			System.out.println("La posicion de " + searched + " es: " + position);			 
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
		double inicio = System.nanoTime();
		System.out.println("¿ Se encuentra " + searched + " ? " 
				+ busquedaBinaria(array, searched));
		double fin = System.nanoTime();
		System.out.println("Se demoro: " + (fin - inicio) + " nanosegundos");
	}
}