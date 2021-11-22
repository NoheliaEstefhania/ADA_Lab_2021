package Queues;

import java.util.*;

/*
 * Ejercicio	: E003
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Caps Lock
 * Details		: You are sending  a  message  to a friend  with a  special  keyboard.  
 * 				  The keyboard only  accepts lowercase  letters,  and stores  them  in a  buffer.
				  When the  @ key is  pressed,  it  toggles the  CapsLock key:  all  letters 
				  in the  buffer have their  case flipped,  as  well  as  all  subsequent  keypresses.
 				  When the  $  key is  pressed,  the  entire  buffer is  flushed.
 * Date	  		: 15/11/2021
 */

public class E003_Caps_Lock {
	public static void main(String[] args) {
		String txt = "abc$d@ef$@g$";
		System.out.println(txt);
		capsLock(txt);
	}

	public static void capsLock(String txt) {
		Queue<Character> queue = enQueue(txt);
		
		String message = "";
		String buffer = "";
		
		boolean toUpperCase = false;
		
		while(!queue.isEmpty()) {
			Character letter = queue.poll();
			if(letter == '$') {
				if(toUpperCase) {
					buffer = buffer.toUpperCase();
				} 
				message += buffer;
				buffer = "";
				
			} else if(letter == '@') { 
				toUpperCase = !toUpperCase;
			} else {
				buffer += letter;
			}
		}
		System.out.print(message);
	}

	public static Queue<Character> enQueue(String txt) {
		Queue<Character> queue = new LinkedList<Character>();
		for(Character c : txt.toCharArray()) {
			queue.add(c);
		}
		return queue;
	}
}