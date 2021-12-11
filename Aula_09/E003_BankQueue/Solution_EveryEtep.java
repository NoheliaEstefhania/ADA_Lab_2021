package E003_BankQueue;

import java.util.*;

/*
 * Ejercicio	: E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: BankQueue 
 * Date	  		: 06/12/2021
 */

public class Solution_EveryEtep {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int N = 4; //el número de personas en la cola
		int T = 4; //el tiempo en minutos hasta que Oliver cierre el banco
		int[] A = {1000, 2000, 500, 1200};
		int[] B = {1, 2, 2, 0};
		System.out.println("Input : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\n");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println("");
		maxProfit(N, T, A, B);
	}

	public static void maxProfit(int N, int T, int [] A, int [] B) {
		int totalCashAmount = 0;
		int aceptedPersons = 0;
		
		PriorityQueue<Person> pq = new PriorityQueue<Person>(N, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			pq.add(new Person(A[i], B[i]));
		}

		boolean[] select = new boolean[T];
		Person nextPerson;
		
		while (aceptedPersons < N && !pq.isEmpty()) {
			System.out.println("\nAún hay personas en la cola ");
			nextPerson = (Person)pq.poll();
			System.out.println("Pasamos a la siguiente persona ");
			int start = nextPerson.time;

			while (start >= 0 && select[start]) {
				start--;
			}
			System.out.println("Si el dinero es mayor al requerido o el tiempo disponible de la persona es mayor al restante del banco");
			if (start != -1) {
				aceptedPersons++;
				System.out.println("El número de personas que serán atendidas se incrementa en 1, entonces, aceptedPersons = " + aceptedPersons);
				select[start] = true;
				System.out.println("Si la persona fue seleccionada la marcamos select = true");
				totalCashAmount += nextPerson.cash;
			}
		}
		System.out.println("\nOutput : " + totalCashAmount);  
	}
}

class Person implements Comparable<Person> {
	int cash; //dinero que quiere depositar la persona
	int time; //tiempo máximo de espera de la persona

	public Person(int cash, int time) {
		this.cash = cash;
		this.time = time;
	}

	public int compareTo(Person p) {
		int pcash = p.cash;
		int ptime = p.time;

		if (cash < pcash) {
			return -1;
		}
		if (cash > pcash) {
			return 1;
		}			
		if (time < ptime) {
			return -1;
		}
		if (time > ptime) {
			return 1;
		}
		return 0;
	}	
}
