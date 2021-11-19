package Stacks;

import java.util.Stack;

/*
 * Ejercicio	: E001
 * Author	: Nohelia Estefhania Tacca Apaza
 * Description	: Staks
 * Details	: Reverse Polish Notation (RPN) Writing "2 3 +" instead of "2 + 3".
 		  Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
		  Note that division between two integers should truncate toward zero.
		  It is guaranteed that the given RPN expression is always valid. 
		  That means the expression would always evaluate to a result, and there will not be any division 
		  by zero operation
 * Date	  	: 15/11/2021
 */

public class E001_Evaluate_Reverse_Polish_Notation {
	
	public static void main(String[] args) {

		String tokens1 [] =  {"2","1","+","3","*"};
		System.out.println(Evaluate_RPN(tokens1));
		System.out.println("----");

	}

	public static int Evaluate_RPN(String[] tokens) {
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
