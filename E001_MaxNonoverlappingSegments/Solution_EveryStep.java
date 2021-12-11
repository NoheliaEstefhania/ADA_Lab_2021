package E001_MaxNonoverlappingSegments;

import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: MaxNonoverlappingSegments 
 * Date	  		: 06/12/2021
 */

public class Solution_EveryStep {
	public static void main(String args[]) {
		// Valores dados en el ejemplo del ejercicio
		int[] A = { 1, 3, 7, 9, 9 };
		int[] B = { 5, 6, 8, 9, 10 };
		
		System.out.println("Input : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\n");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println("\nOutput : " + solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		// Si A es una lista vacía
		if (A.length == 0) {
			return 0; //retornamos cero, porque si no hay segmentos, tampoco habrá segmentos
		}
		// Si A es una lista con un solo dato
		if (A.length == 1) {
			return 1; //retornamos uno, porque si solo hay un segmento, sólo habrá un segmento que no estará superpuesto con otro
		}

		//inicializamos los valores
		int count = 1;
		System.out.println("\n\ncount = " + count);
		int finalOfActualSegment = B[0];
		System.out.println("\nFinal del segmento actual B[0] " + finalOfActualSegment);
		
		// Algorithm
		for (int i = 1; i < A.length; i++) {
			System.out.println("Inicio del segmento siguiente A["+ i + "] " + A[i]);
			if (A[i] > finalOfActualSegment) {
				System.out.println("\t--> " + A[i] + " > " + finalOfActualSegment);
				count++;
				System.out.println("\tQuiere decir que no se cruzarán con el nuevo inicio, por lo tanto count se agregó en uno, entonces count = " + count);
				finalOfActualSegment = B[i];
				System.out.println("----------------------------------------------------------");
				System.out.println("\nFinal del segmento actual B["+ i + "] " + finalOfActualSegment);
			}
			else {
				//System.out.println("\nFinal del segmento actual B"+ i + " " + finalOfActualSegment);
				System.out.println("\t--> " + A[i] + " <= " + finalOfActualSegment);
				System.out.println("\tPor lo tanto el segmento que inicia en " + A[i] + " se cruza con el segmento que termina en " + finalOfActualSegment + " entonces, count se mantiene con su valor, count = " + count );
				
			}
		}

		return count;
	}
}
