package Aula_02;

import java.util.*;;
/*
 * Ejercicio - E001 
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Counting Divisors
 * Date	  : 20/09/2021
 */
public class E001_CountDivisors {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n, x, count=0;
		System.out.print("Ingrese la cantidad de números a evaluar :");
		n= s.nextInt () ;
		System.out.print("Ingrese el número dividor :");
		x= s.nextInt () ;
		System.out.println("Ingrese los números");
		System.out.println("-----");
		for (int i=0;i<=n-1;i++) {
			int numero = s.nextInt();
			if (numero % x==0)
		count++;	 
		}
		System.out.print(x + "es divisor de " + count + " numeros") ; 
	}
}

