package Deque;

import java.util.*;

/*
 * Ejercicio	: E005
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Deque
 * Details		: You are sitting  on a row  of chairs,  waiting  for an interview. 
 			  	  When choosing the  next  interviewee,  the  interviewer  will  always choose  from  
 			  	  either  the  very left  side  or the  very right  side  of the  row  of chairs.
 * Date	  		: 15/11/2021
 */

public class E005_Interview_Wait {

	public static void main(String[] args) {

		int[] array = { 4, -1, 5, 2, 3 };

		interviewVait(array);
	}

	/*
	 * método que devuelve el tiempo que se debe de esperar para la entrevista,
	 * haciendo uso de Deque
	 */

	private static void interviewVait(int[] array) {

		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < array.length; i++) {
			deque.addLast(array[i]);
		}

		System.out.println("Input : " + deque);

		int time = 0;
		while (true) {
			if (deque.peek() == -1 || deque.peekLast() == -1) {
				break;
			}
			if (deque.peek() < deque.peekLast()) {
				time += deque.pollFirst();
			} else {
				time += deque.pollLast();
			}
		}
		System.out.println("Ouput : " + time);
	}
}
