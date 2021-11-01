package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q6
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (triangularNumber)?
 * Answer: The time complexity is: O(sqrt(n)) --> square root time      
 * Date	  : 25/10/2021
 */

public class E006_Q6_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Numeros triangualares ");
		System.out.println("-----------------------------");
		triangularNumber(n);
	}

	//muestra los numeros triangualares

	public static void triangularNumber(int n) {
		int p = 0; 				  							
		for (int i = 1; p <= n; i++) {				
			p = p + i;				 	
			System.out.println(p);	 	
		}   							
	}
}	

/*	
  i       p
 ------------------------
  1       0 + 1 = 1
  2       1 + 2
  3       1 + 2 + 3
  4       1 + 2 + 3 + 4
  .    
  .    
  .    
  k       1 + 2 + 3 + 4 + ... + k
 
 Assume k > n
 p = k * (k + 1) / 2
               p > n
 k * (k + 1) / 2 > n
 k^2 > n
 k > sqrt(n)
 O(n^(1/2))
 
 */
