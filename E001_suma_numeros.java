package Aula_01;

import java.util.*;

/*
 * Author: Nohelia Estefhania Tacca Apaza
 * Exercise: Nro 1
 * Details: Leer n números en un array y retornar la suma de los mismos
 */

public class E001_suma_numeros {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		
		System.out.println("SUMA DE NÚMEROS\n");
		
		System.out.println("¿Cuántos números desea sumar? : ");
		int n = s.nextInt();
		int i = 0;
		int num;
		
		System.out.println("Ingresa los números por favor\n");
		while(i<n) {
		num = s.nextInt();
		numeros.add(num);
		i++;
		}

		System.out.println("La suma de los números ingresados es: " + sumarArray(numeros));
	}
	
	
	public static int sumarArray(ArrayList<Integer> array) {
		
		int suma = 0;
		
		for(int i=0; i<= array.size()-1; i++) {
			suma+= array.get(i);
		}
		return suma;	
	}
}
