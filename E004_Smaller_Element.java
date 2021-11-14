package Binary_Search;

import java.util.Scanner;

/*
 * Ejercicio - E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Binary Search algorithm
 * Question		: Encuentre el  primer  valor mayor o igual que  x
 * Date	  		: 08/11/2020
 */

public class E004_Smaller_Element {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int searched, position;
		int[] nums = {6, 7, 9, 15, 19, 2, 3};
		System.out.println("Ingrese el número que esté buscando:");
		searched = s.nextInt();
		position = busquedaBinaria(nums, searched);
		if (position == -1)
			System.out.println("No se encontró");
		else
			System.out.println("La posicion de " + searched + " es: " + position);
	}
	//devuelve la posición del siguiente número que se pone en la búsqueda
	private static int busquedaBinaria(int[] nums, int searched1) {
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
