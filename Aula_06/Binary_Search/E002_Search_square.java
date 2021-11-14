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
		int searched, position;
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Ingrese el número que esté buscando:");
		searched = s.nextInt();
		position = busquedaBinaria(nums, searched);
		if (position == -1)
			System.out.println("--> " + searched + " No es un cuadrado ");
		else
			System.out.println("--> " + searched + " Si es un cuadrado");
	}
	//devuelve -1 si es que el número no se trata de un cuadrado
	private static int busquedaBinaria(int[] nums, int searched1) {
		int alta, baja, media;
		baja = 0; //L
		alta = (nums.length - 1); //R
		
		while (baja <= alta) {
			media = (baja + ((alta - baja) / 2));
			int nums_media = nums[media];
			if (nums_media * nums_media == searched1) {
				return media;
			} else if ((nums_media*nums_media) < searched1) {
				baja = media + 1;

			} else {
				alta = media - 1;
			}
		}
		return -1;
	}
}
