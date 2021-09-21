package Aula_01;

import java.util.*;

/*
 * Author: Nohelia Estefhania Tacca Apaza
 * Exercise: Nro 2
 * Details: Leer n números en un array y mostrarlos en orden inverso
 */

public class E002_orden_inverso {
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

		System.out.println("Array invetido es: " + mostrarArray(numeros));
	}
	
	
	public static ArrayList<Integer> mostrarArray(ArrayList<Integer> array) {
		
		ArrayList<Integer> nuevo= new ArrayList<Integer>();
		
		for(int i = array.size()-1; i >= 0; i--) {
			nuevo.add(array.get(i));
		}
		
		return nuevo;
	}
}
