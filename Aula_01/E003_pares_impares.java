package Aula_01;

import java.util.*;

/*
 * Author: Nohelia Estefhania Tacca Apaza
 * Exercise: Nro 3
 * Details: Leer n números y separarlos según si son pares e impares.
 */

public class E003_pares_impares {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
		ArrayList<Integer> numeros= new ArrayList<Integer>();
				
		System.out.println("¿Cuántos números desea ingresar? : ");
		int n = s.nextInt();
		int i = 0;
		int num;
		
		System.out.println("Ingresa los números por favor\n");
		while(i<n) {
		num = s.nextInt();
		numeros.add(num);
		i++;
		}
		
		System.out.println("Array inicial : "+ numeros);
		mostrar(numeros);
		
	}
	
	public static void mostrar(ArrayList<Integer> array) {
		
		ArrayList<Integer> pares= new ArrayList<Integer>();
		
		ArrayList<Integer> impares= new ArrayList<Integer>();
		
		for(int i=0; i<= array.size()-1; i++) {
			
			if (array.get(i) % 2 == 0) {
				pares.add(array.get(i));
			}
			else {
				impares.add(array.get(i));
			}
		}
		
		System.out.println("Pares : " + pares);
		
		System.out.println("Impares : " + impares);
	}

}
