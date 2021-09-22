package Aula_02;
import java.util.Scanner;
/*
 * Ejercicio - E004 
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Busqueda Secuencial
 * Date	  : 20/09/2020
 */
import java.util.Timer;

public class E004_BusquedaSecuencial {

	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int[] nums = crearArray();
		System.out.println("Ingrese el número que está buscando:");
		int searched=s.nextInt();
		timer(nums, searched);
	}
	private static boolean BusquedaSecuencial(int[]nums, int t) {		 
		for(int i = 0; i <= nums.length-1; i++) {
			if (nums[i] == t) {

				return true;
			}
		}
		return false;
	}
	private static int[] crearArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de números del array :");
		int n=s.nextInt();
		int x = 0;
		int [] array= new int [n];
		for(int i = 0; i <= array.length-1; i++) {
			array[i]= x;
			x = x+1;

		}
		return array;
	}
	private static void timer(int nums[] ,int searched) {
		double inicio = System.currentTimeMillis();
		System.out.println("Se encuentra "+ searched + " ? ");
		System.out.println(BusquedaSecuencial(nums, searched));
		double fin = System.currentTimeMillis();
		System.out.println("Se demoro: "+ (fin-inicio)+"milisegundos");
	}

}

