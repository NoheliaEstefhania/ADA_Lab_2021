package Aula_02;

import java.util.Random;
import java.util.Scanner;
/*
 * Ejercicio - E005 
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Insertion Algorithm - Timer
 * Date	  : 20/09/2021
 */

public class E005_InsertionSortTimer {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int n = 10;
		while (n <= 100000000) {
			int[] array = crearArray(n);
			System.out.println("\ncantidad de elementos en el array " + n);
			timer(array);
			n = n * 10;
		}
	}

	// metodo java de ordenacion por insercion
	public static void insertionAlgorithm(int x[]) {
		int aux, j;
		for (int i = 1; i < x.length; i++) {
			aux = x[i];
			j = (i - 1);
			while (j > -1 && x[j] > aux) {
				x[j + 1] = x[j];
				j = j - 1;
			}
			x[j + 1] = aux;
		}
	}

	private static int[] crearArray(int n) {
		Scanner s = new Scanner(System.in);
		//System.out.println("--------------------");
		//System.out.println("Los números :");
		//System.out.println("--------------------");
		int x;
		int[] array = new int[n];
		for (int i = 0; i <= array.length - 1; i++) {
			Random rnd = new Random();
			x = (int) (rnd.nextDouble() * 100 + 1);
			//System.out.println(x);
			array[i] = x;
		}
		return array;
	}

	private static void timer(int nums[]) {
		double inicio = System.currentTimeMillis();
		//System.out.println("----------------------");
		//System.out.println("Números ordenados :");
		//System.out.println("----------------------");
		insertionAlgorithm(nums);
		//for (int i = 0; i < nums.length; i++)// muestra el ordenamiento de menor a mayor
			//System.out.println(nums[i] + " ");
		double fin = System.currentTimeMillis();
		System.out.println("--------------------");
		System.out.println("Se demoro: " + (fin - inicio) + " milisegundos");
		System.out.println("--------------------");
	}
}
