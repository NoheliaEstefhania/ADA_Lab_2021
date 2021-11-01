package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q8
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (entreDos)?
 * Answer: The time complexity is: O(log_2(n)) --> logarithmic time       
 * Date	  : 25/10/2021
 */

public class E008_Q8_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Resultados de: n / 2^k ");
		System.out.println("-----------------------------");
		entreDos(n);
	}

	//Division de n entre 2

	public static void entreDos(int n) {
		
		for (int i = n; i >= 1; i = i/2) {//	|O(2^(n))	|= O(1) * 0(2^(n))
			//statement							|			|= O(2^(n))
			System.out.println(i);	 //	= O(1)	|			|= O(log_2(n))
		}   //									|			|Time complexity = O(log_2(n))					
	}
}	

/*	
  	i       
	------------------------
	n
	n / 2
	n / 2^2
	n / 2^3
	.    
	.    
	.    
	n / 2^k
	
	Assume that i < 1
	Therefore n / 2^k < 1
    		  n / 2^k = 1
     		  n = 2^k
   		  	  k = log_2(n)
		
	complexity = O(log_2(n))
 
 */
