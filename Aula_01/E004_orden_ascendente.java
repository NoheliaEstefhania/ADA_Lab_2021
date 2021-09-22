package Aula_01;

import java.util.*;

/*
 * Author: Nohelia Estefhania Tacca Apaza
 * Exercise: Nro 4
 * Details: Leer 3 números y mostrarlos en orden ascendente
 */

public class E004_orden_ascendente {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ORDEN ASCENDENTE\n");

		System.out.println("Ingresa los números por favor\n");
		int a, b, c;

		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		System.out.println("lista inicial : " + a + " - " + b + " - " + c);
		int mayor = 0, medio = 0, menor = 0;

		if (a > b && a > c) {
			mayor = a;

		} else if (b > a && b > c) {
			mayor = b;

		} else {
			mayor = c;

		}

		if (a < b && a < c) {
			menor = a;

		} else if (b < a && b < c) {
			menor = b;
		}

		else {
			menor = c;
		}

		medio = (a + b + c) - (mayor + menor);

		System.out.println("lista ordenada ascendentemente : --> " + menor + " - " + medio + " - " + mayor);
	}
}
