package E001_MaxNonoverlappingSegments;

import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: MaxNonoverlappingSegments 
 * Date	  		: 06/12/2021
 */

public class Solution {
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
		if (A.length == 0) {
			return 0; 
		}
		if (A.length == 1) {
			return 1; 
		}
		int count = 1;
		int finalOfActualSegment = B[0];

		for (int I = 1; I < A.length; I++) {
			if (A[I] > finalOfActualSegment) {
				count++;
				finalOfActualSegment = B[I];
			}
		}
		return count;
	}
}
