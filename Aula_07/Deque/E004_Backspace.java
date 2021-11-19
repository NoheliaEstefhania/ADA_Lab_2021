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

	// Driver Code
	public static void main(String[] args) {
		String S = "abc#de##f#ghi#jklmn#op#";

		// function call to print
		// required answer
		System.out.println(newString(S));
	}

	// This code is contributed
	// by prerna saini
	static String newString(String S) {
		Stack<Character> q = new Stack<Character>();

		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) != '#')
				q.push(S.charAt(i));
			else if (!q.isEmpty())
				q.pop();
		}

		// build final string
		String ans = "";

		while (!q.isEmpty()) {
			ans += q.pop();
		}

		// return final string
		String answer = "";
		for (int j = ans.length() - 1; j >= 0; j--) {
			answer += ans.charAt(j);
		}
		return answer;
	}
}
