package Stacks;

import java.util.*;

/*
 * Ejercicio	: E002
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Staks - Minimum Add to Make Parentheses Valid
 * Details		: Reverse Polish Notation (RPN) Writing "2 3 +" instead of "2 + 3".
 			  	  Given a String S of '(' and ')', compute the minimum number of '(' or ')'
 			  	  that needs to be added so that the resulting parentheses string is valid.
 			  	  Formally a parenthesis string is valid if and only if: 
 			  	  * It is the empty string, or 
 			  	  * It can be written as AB(concateneted with B), where A and B are valid strings, or
 			  	  * It can be written as (A), where A is a valid string.
 * Date	  		: 15/11/2021
 */

public class E002_MinimunAdd_toMake_Parenthesis_Valid {
	public static void main(String[] args) {

		String prueba1 = "())";
		System.out.println("ouput : " + minAddToMakeValid(prueba1));
		System.out.println("----");
		String prueba2 =  "(((";
		System.out.println("ouput : " + minAddToMakeValid(prueba2));
		System.out.println("----");
		String prueba3 = "(()))("; 
		System.out.println("ouput : " + minAddToMakeValid(prueba3));
		System.out.println("----");
		String prueba4 = "()))(("; 
		System.out.println("ouput : " + minAddToMakeValid(prueba4));
		System.out.println("----");

	}
    public static int minAddToMakeValid(String txt) {
        System.out.println("input : " + txt);
    	int ans = 0, bal = 0;
        for (int i = 0; i < txt.length(); ++i) {
            bal += txt.charAt(i) == '(' ? 1 : -1;
            if (bal == -1) {
                ans++;
                bal++;
            }
        }

        return ans + bal;
    }
}
