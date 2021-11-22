package Stacks;

import java.util.Stack;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Staks - Reverse Polish Notation (RPN)
 * Details		: Writing "2 3 +" instead of "2 + 3".
 			  	  Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
				  Note that division between two integers should truncate toward zero.
				  It is guaranteed that the given RPN expression is always valid. 
				  That means the expression would always evaluate to a result, and there will not be any division 
				  by zero operation
 * Date	  		: 15/11/2021
 */

public class E001_Evaluate_Reverse_Polish_Notation {
	
	public static void main(String[] args) {

		String prueba1 [] =  {"2","1","+","3","*"};
		System.out.println("\nouput : " + Evaluate_RPN(prueba1));
		System.out.println("----");
		String prueba2 [] =  {"4","13","5","/","+"};
		System.out.println("\nouput : " + Evaluate_RPN(prueba2));
		System.out.println("----");
		String prueba3 [] =  {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println("\nouput : " + Evaluate_RPN(prueba3));
		System.out.println("----");

	}

	public static int Evaluate_RPN(String[] tokens) {
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i]);
		}
		Stack<Integer> st = new Stack();
		
		for (String t : tokens) {
			if ("+-*/".contains(t))
				st.push(evaluate(st.pop(), st.pop(), t));
			else
				st.push(Integer.parseInt(t));
		}

		return st.pop();
	}

	private static int evaluate(int b, int a, String op) {
		if ("+".equals(op))
			return a + b;
		else if ("-".equals(op))
			return a - b;
		else if ("*".equals(op))
			return a * b;
		else
			return a / b;
	}
}
