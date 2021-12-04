package Aula_08;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio	: E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Number of Longest Increasing Subsequence
 * Date	  		: 29/11/2021
 */

public class E003_Number_of_Longest_Increasing_Subsequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int n = nums.length;
		System.out.print("Input : ");
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\nOutput : " + numberOf_LIS(nums));
	}

	// Devuelve el total de numeros que contiene la subsecuencia más larga creciente
	public static int numberOf_LIS(int nums[]) {
	    if(nums==null || nums.length==0)
	        return 0;
	 
	    int[] max = new int[nums.length];
	    Arrays.fill(max, 1);
	 
	    int result = 1;
	    for(int i=0; i<nums.length; i++){
	        for(int j=0; j<i; j++){
	            if(nums[i]>nums[j]){
	                max[i]= Math.max(max[i], max[j]+1);
	 
	            }
	        }
	        result = Math.max(max[i], result);
	    }
	 
	   return result;
	}

}