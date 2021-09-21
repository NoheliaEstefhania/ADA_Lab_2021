package Aula_02;
import java.util.Scanner;
/*
 * Ejercicio - E004 
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Busqueda Secuencial
 * Date	  : 20/09/2020
 */

public class E004_BusquedaSecuencial {

	public static void main(String[] arg) {
		int n;
		Scanner s = new Scanner(System.in);
		int searched;
		System.out.println("Ingrese la cantidad de números a ingresar :");
		n=s.nextInt();
		int [] nums=new int[n];	 
		System.out.println("----------------");
		System.out.println("Ingresar los números:");
		System.out.println("----------------");
		for(int i=0;i<=nums.length-1;i++) {
			nums[i]=s.nextInt();		
		}
		System.out.println("Ingrese el número que está buscando:");
		searched=s.nextInt();
		BusquedaSecuencial(nums, searched);
	}
	private static void BusquedaSecuencial(int[]nums, int searched1) {		 
		int loc=0;
		while(loc<nums.length && nums[loc] !=searched1)
			loc++;
		if (loc==nums.length) 
			System.out.println("-1");		      
		else
			System.out.println("La posición de " + searched1 + " es: " + loc);			 
	}
	private void timer() {
		int[] nums = crearArray();
		double inicio = System.currentTimeMillis();
		System.out.println("Se encuentra 15?");
		BusquedaSecuencial(nums, 15);
		double fin = System.currentTimeMillis();
		System.out.println("Se demoro: "+ (fin-inicio)+"milisegundos");
	}
	private int[] crearArray() {
		// TODO Auto-generated method stub
		return null;
	}
}

