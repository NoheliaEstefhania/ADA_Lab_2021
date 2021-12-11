package E002_TieRopes;
import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: MaxNonoverlappingSegments 
 * Date	  		: 06/12/2021
 */

public class Solution {
	public static void main(String args[]) {
		int[] A = {1, 2, 3, 4, 1, 1, 3};
		int k = 4;
		System.out.println("Input : ");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.print("\n");
		
		System.out.println("\nOutput : " + solution(k, A));
	}
	
    public static int solution(int K, int[] A) {       
        int count = 0;
        int ropeLength = 0;
        
        for(int i = 0; i < A.length; i++){
      
            ropeLength += A[i];
            
            if(ropeLength >= K){
                count++;
                ropeLength = 0;
            }
        }
        return count; 
    }
}
