package Deque;

import java.util.*;

/*
 * Ejercicio	: E004
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Deque - Backspace
 * Details		: You are sending  a  message  to a friend  with a  special  keyboard. 
 			  	  The keyboard  only  accepts  lowercase  letters.
 			  	  When the  # button is  pressed,  the  last  letter  is deleted  from the  message
 			  	  Given  some  keypresses:  output the  resulting  message.
 * Date	  		: 15/11/2021
 */

public class E004_Backspace {

	public static void main(String[] args) {
		String txt = "abc#de##f#ghi#jklmn#op#";
		
		System.out.println("Ouput : " + backSpace(txt));
	}

	static String backSpace(String txt) {
		System.out.println("input : " + txt);
		
		Stack<Character> q = new Stack<Character>();
		for (int i = 0; i < txt.length(); ++i) {
			if (txt.charAt(i) != '#')
				q.push(txt.charAt(i));
			else if (!q.isEmpty())
				q.pop();
		}
		
		String message = "";

		while (!q.isEmpty()) {
			message += q.pop();
		}

		String answer = "";
		for (int j = message.length() - 1; j >= 0; j--) {
			answer += message.charAt(j);
		}
		return answer;
	}
}
