package Aula_04;

import java.util.*;

/*
 * Ejercicio - E001
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Mayor de un arreglo de numeros 
 * Complexity: O(n) 
 * Date	  : 18/10/2021
 */

public class E001_Greatest_Number {
	public static void main(String[] args) {
		int n;
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n=s.nextInt();
		int [] array=new int[n];	 
		System.out.println("----------------");
		System.out.println("Lista de Números:");
		System.out.println("----------------");
		for(int i=0;i<=array.length-1;i++) {
			array[i]=s.nextInt();		
		}
		
		System.out.println("-------------------------");
		System.out.println("The greatest number is : "+ greatestNumber(array));
		System.out.println("-------------------------");		 
	}		
	
	//devuelve el mayor número del array
	public static int greatestNumber(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;	
	}
}