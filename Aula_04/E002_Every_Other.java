package Aula_04;

import java.util.*;

/*
 * Ejercicio - E002
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Every Other
 * Question: What's the time complexity of this code?
 * Answer: The time complexity is O(n²) (complejidad cuadrática)
 * Date	  : 23/10/2021
 */

public class E002_Every_Other {
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
		System.out.println("Resultado final ");
		System.out.println("-------------------------");

		everyOther(array, n);

	}

	//toda vez que encuentra un indice par, al numero que se encuentra en dicha posicion 
	//le suma los otros, para esto, recorre de nuevo el array
	
	public static void everyOther(int[] array, int n) {

		int[] newArray = new int[n];

		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					newArray[j] = array[i]+ array[j];
					System.out.println(array[i] + " + " + array[j] + " = " + newArray[j]);
				}
			}
			System.out.print("\n");
		}

	}
}
