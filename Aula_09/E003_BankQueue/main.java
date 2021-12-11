package E003_BankQueue;

import java.util.*;

class main {
	public static void main(String[] args) {
		maxResult();
	}

	public static void maxResult() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int T = s.nextInt();
		int totalCash = 0;
		int aceptedPersons = 0;

		PriorityQueue<Person> pq = new PriorityQueue<Person>(N, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			pq.add(new Person(s.nextInt(), s.nextInt()));
		}

		boolean[] select = new boolean[T];
		Person nextPerson;
		while (aceptedPersons < N && !pq.isEmpty()) {
			nextPerson = (Person)pq.poll();
			int start = nextPerson.time;

			while (start >= 0 && select[start]) {
				start--;
			}

			if (start != -1) {
				aceptedPersons++;
				select[start] = true;
				totalCash += nextPerson.cash;
			}
		}
		System.out.println(totalCash);  
	}
}

class Person implements Comparable<Person> {
	int cash;
	int time;

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
