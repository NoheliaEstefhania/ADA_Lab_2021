package Binary_Search;

import java.util.*;

/*
 * Ejercicio - E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Binary Search algorithm
 * Date	  		: 08/11/2020
 */

public class E001_Binary_Search {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int searched, position;
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		searched = 2; //position = 1
		position = busquedaBinaria(nums, searched);
		if (position == -1)
			System.out.println("No se encontró");
		else
			System.out.println("La posicion de " + searched + " es: " + position);
	}
	//devuelve 
	private static int busquedaBinaria(int[] nums, int searched1) {
		System.out.println("El número buscado es : " + searched1);
		int alta, baja, media;
		baja = 0; //L
		alta = (nums.length - 1); //R
		while (baja <= alta) {
			media = (baja + ((alta - baja) / 2));
			if (nums[media] == searched1) {
				return media;
			} else if (nums[media] < searched1) {
				baja = media + 1;

			} else {
				alta = media - 1;
			}
		}
		return -1;
	}
}
