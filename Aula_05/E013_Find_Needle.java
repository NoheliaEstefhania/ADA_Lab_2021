package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - E013
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity find needle
 * Question: What is the time complexity of method (find_needle)?
 * Answer: The time complexity is O(n*m) 
 * Date	  : 31/10/2021
 */

public class E013_Find_Needle {
	public static void main(String[] args) {
		String needle;
		String haystack;

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cadena completa :");
		haystack = s.nextLine();
		System.out.println("Ingrese el/los caracter(es) de busqueda :");
		needle = s.nextLine();

		System.out.println("------------------------------------------------------------");
		if(find_needle(needle, haystack)) {
			System.out.println("\"" + needle + "\" SÍ se encuentra dentro de la cadena ingresada ");
		}
		else {
			System.out.println("\"" + needle + "\" NO se encuentra dentro de la cadena ingresada ");
		}
		System.out.println("------------------------------------------------------------");
		

	}
	//fgh --> abcdefghi (busca una determinada cadena en otra más grande)
	public static boolean find_needle(String needle, String haystack) {

		int needle_index = 0;
		int haystack_index = 0;
		boolean found_needle = false;
		// "n" --> itera sobre haystack
		while(haystack_index < haystack.length()) { 
			if(needle.charAt(needle_index) == haystack.charAt(haystack_index)) {
				found_needle = true;
				// "m" itera sobre needle
				while(needle_index < needle.length()) { 
					if(needle.charAt(needle_index) != haystack.charAt(haystack_index + needle_index)) {
						found_needle = false;
						break;
					}	
					needle_index++;
				}
				if(found_needle) {
					return true;
				}
			}
			needle_index = 0;
			haystack_index++;
		}
		return false;
	}
}



/*
 * Complexity:
 * 
 * El primer ciclo while itera n veces y el siguiente que es anidado 
 * al primero, iter m veces. Por lo tanto.
 * 
 * con:
 * n = haystack.length 
 * m = needle.length
 * 
 * tenemos que:
 * primer ciclo = O(n)
 * segundo ciclo = O(m)
 * 
 * Finalmente
 * O(n) * O(m) = O(n*m) 
 * 
 */
