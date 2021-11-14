package Binary_Search;

import java.util.*;

/*
 * Ejercicio - E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Binary Search algorithm
 * Question		: Encuentre el  primer  valor mayor o igual que  x
 * Date	  		: 08/11/2020
 */

public class E003_First_Mayor {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int searched, position;
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Ingrese el número que esté buscando:");
		searched = s.nextInt();
		position = busquedaBinaria(nums, searched);
		if (position == -1)
			System.out.println("No se encontró");
		else
			System.out.println("El primer número mayor a " + searched + " está en la posición : " + position);
	}
	//devuelve la posición del siguiente número mayor que se pone en la búsqueda
	private static int busquedaBinaria(int[] nums, int searched1) {
		int alta, baja, media;
		baja = 0; //L
		alta = (nums.length - 1); //R
		while (baja <= alta) {
			media = (baja + ((alta - baja) / 2));
			if (nums[media] == searched1) {
				return nums[media + 1];
			} else if (nums[media] < searched1) {
				baja = media + 1;

			} else {
				alta = media - 1;
			}
		}
		return -1;
	}

}
