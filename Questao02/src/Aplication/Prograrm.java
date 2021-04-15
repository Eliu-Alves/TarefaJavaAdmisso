package Aplication;

import java.util.Scanner;

public class Prograrm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sera a sequencia dos numeros?");
		int x = sc.nextInt();
		
		for (int i = 0; i<=x; i++) {
			if ((i % 3==0) && (i % 5 == 0)) {
				System.out.println(i + " FizzBuzz");
			}
			else if (i % 3==0) {
				System.out.println(i+ " Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println(i+ " Buzz");
			}
			else {
				System.out.println(i);
			}
				
		}
		
		
		sc.close();
	}

}
