package E002_TieRopes;
import java.util.*;

/*
 * Ejercicio	: E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: TieRopes 
 * Date	  		: 06/12/2021
 */

public class Solution_EveryStep {
	public static void main(String args[]) {
		int[] A = {1, 2, 3, 4, 1, 1, 3};
		int k = 4;
		System.out.println("Input : ");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.print("\n\n");
		System.out.println("*Iniciamos el análisis* \n");
		System.out.println("Vamos agregando el largo de las cuerdas en el orden en el que se encuentran");
		
		System.out.println("\nOutput : " + solution(k, A));
	}
	
    public static int solution(int K, int[] A) {
        
        int count = 0;
        int ropeLength = 0;
        
        for(int i = 0; i < A.length; i++){
      
            ropeLength += A[i];
            System.out.println("El largo de la cuerda es " + ropeLength);
            
            if(ropeLength >= K){
            	System.out.println("--> El largo de la cuerda es mayor o igual a " + K);
                count++;
                System.out.println("\tEntonces, agregamos directamente nuestro contador en uno, por lo tanto count = " + count);
                ropeLength = 0;
                System.out.println("\tluego inicializamos nuevamente el valor del largo de la cuerda ");
            }
        }
        return count; //devuelve el número máximo de cuerdas de longitud mayor o igual a K que se pueden crear.
    }
}
