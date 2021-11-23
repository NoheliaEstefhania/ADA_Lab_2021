package Binary_Search;

import java.util.Scanner;

/*
 * Ejercicio - E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Binary Search algorithm
 * Question		: ¿Es x un cuadrado?  
 			 	  No use  la función sqrt. Tienen que usar búsqueda binaria.
 * Date	  		: 08/11/2020
 */

public class E002_Search_square {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int numEvaluado, position;
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		numEvaluado = 8; 
		position = busquedaBinaria(nums, numEvaluado);
		if (position == -1)
			System.out.println("--> " + numEvaluado + " No es un cuadrado ");
		else
			System.out.println("--> " + numEvaluado + " Si es un cuadrado");
	}
	//devuelve -1 si es que el número no se trata de un cuadrado
	private static int busquedaBinaria(int[] nums, int numEvaluado) {
		System.out.println("El número evaluado es : " + numEvaluado);
		int alta, baja, media;
		baja = 0; //L
		alta = (nums.length - 1); //R
		
		while (baja <= alta) {
			media = (baja + ((alta - baja) / 2));
			int nums_media = nums[media];
			if (nums_media * nums_media == numEvaluado) {
				return media;
			} else if ((nums_media*nums_media) < numEvaluado) {
				baja = media + 1;

			} else {
				alta = media - 1;
			}
		}
		return -1;
	}
}
