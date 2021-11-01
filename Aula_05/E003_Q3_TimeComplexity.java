package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q3
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (parNumberList)?
 * Answer: The time complexity is: O(n) --> lineal time 
 * Date	  : 25/10/2021
 */

public class E003_Q3_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros pares <= " + ((n)));
		System.out.println("---------------------------");
		parNumberList(n);
	}
	
	//muestra los numeros pares menores o iguales a n 

	public static void parNumberList(int n) {

		for (int i = 0; i < n; i = i+2) {//		|O(n/2)		|= O(1) * 0(n/2)
			//statement				|		|= O(n/2)
			System.out.println(i);	 //	= O(1)	|		|= O(n)
		}   //						|		|Time complexity = O(n)
	}
}
