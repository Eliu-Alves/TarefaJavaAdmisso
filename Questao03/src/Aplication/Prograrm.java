package Aplication;

import java.util.Scanner;

public class Prograrm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double[] notaAluno = new Double[10];
		String[] nomeAluno = new String[10];

		System.out.println("Aperte enter para iniciar");

		// prencher o array
		for (int i = 0; i <= 9; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do aluno");

			String n = sc.nextLine();
			nomeAluno[i] = n;
			System.out.println("Informe uma nota");
			double x = sc.nextDouble();
			notaAluno[i] = x;

		}

		// visualizar o array
		System.out.println("----//-----------//------------//---------");
		for (int i = 0; i <= 9; i++) {
			System.out.println(nomeAluno[i] + " " + notaAluno[i]);

		}
		System.out.println("----//-----------//------------//---------");
		// somar os elementos
		double total = 0;
		for (int i = 0; i < notaAluno.length; i++) {
			total += notaAluno[i];
		}
		// calculo da media
		double T = total / 10;
		System.out.printf("A media da turma é %.2f", T);

		System.out.println();
		System.out.println("----//-----------//------------//---------");

		// Maior Nota
		int indexMaior = 0;
		double maior = notaAluno[0];

		for (int i = 0; i <= 9; i++) {
			if (notaAluno[i] > maior) {
				maior = notaAluno[i];
				indexMaior = i;
			}

		}

		System.out.println("A Maior nota da sala foi do " + nomeAluno[indexMaior] + " " + maior);

		// Menor nota
		int indexMenor = 0;
		double menor = notaAluno[0];

		for (int i = 0; i <= 9; i++) {
			if (notaAluno[i] < menor) {
				menor = notaAluno[i];
				indexMenor = i;
			}

		}
		System.out.println("----//-----------//------------//---------");
		System.out.println("A Menor nota da sala foi do " + nomeAluno[indexMenor] + " " + menor);

		sc.close();
	}

}