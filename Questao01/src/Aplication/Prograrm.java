package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Prograrm {
	public static void main(String[]Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Diga o primeiro lado do triangulo");
		 double a = sc.nextDouble();
		System.out.println(" Diga o segundo lado do triangulo");
		 double b = sc.nextDouble();
		System.out.println("Diga o Terceiro Lado do Triangulo");
		 double c=  sc.nextDouble();
		 
		 if ((b+c<a) | (c+a<b) | (b+a<c)) {
			 System.out.println("Triangulo Invalido"); //Condicao para testa se os parametros sao um triangulo
		 }
		 else {
			 if (a!=b && a!=c && b!=c) {
				 System.out.println("Triangulo Escaleno"); // condicoes para saber qual e o tipo do triangulo
			 }
			 else if(a==b && a==c && b==c) {
				 System.out.println("Triangulo Equilatero");
			 }
			 else  {
				 System.out.println("Triangulo Isoceles");
			 }
			 
			 
		 }
		 
		System.out.println(a + " " + b + " " + c);  // apenas para informar os parametros que o usuario colocou 
		
		sc.close();
		
	}
	
}
