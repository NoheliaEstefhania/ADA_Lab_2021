package Aula_04;

import java.util.*;

/*
 * Ejercicio - E003
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: 
 * Date	  : 18/10/2021
 */
public class E003_twoSum {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();
		int[] array = new int[n];
		System.out.println("----------------");
		System.out.println("Lista de Números:");
		System.out.println("----------------");
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = s.nextInt();
		}

		System.out.println("-------------------------");
		System.out.println("¿Hay una suma de 10? " + twoSum(array));
		System.out.println("-------------------------");
	}

	// devuelve true si dos números del array suman 10
	public static boolean twoSum(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && (array[i] + array[j]) == 10) {
					return true;
				}
			}
		}
		return false;

	}
}
