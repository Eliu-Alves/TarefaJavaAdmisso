package Aplication;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Prograrm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		int Y=1;
		
		while(Y==1) {
		// Layout inicial
			System.out.println("***************BEM VINDO A AGENCIA ELETRONICA****************");
				System.out.println("             Escolha a Conta na qual deseja usa");
					System.out.println("1. CONTA CORRENTE           |               2. CONTA POUPANÇA");
						int i = sc.nextInt();

			switch (i) {
			case 1: // conta corrente procedimentos
				System.out.println();
					System.out.println("********************CONTA CORRENTE*********************");
						System.out.println("          Escolha qual procedimento deseja realizar");
							System.out.println("1. Saque               |               2.Deposito");
				int proc = sc.nextInt();

				switch (proc) {
				case 1:
					System.out.println("Qual valor deseja no saque ?");
						double s1 = sc.nextDouble();
							cc.saque(s1);
					break;
				case 2:
					System.out.println("Qual valor deseja Depositar ?");
						double p1 = sc.nextDouble();
							cc.deposito(p1);
								System.out.println("Caro cliente seu saldo agora é de " + cc.getSaldo() + " Reais");
					break;
				default:
					System.out.println("Número inválido, tente novamente mais tarde");
				}
				break;
			case 2: // conta poupança procedimentos
				System.out.println();
					System.out.println("********************CONTA POUPANÇA*********************");
						System.out.println("          Escolha qual procedimento deseja realizar");
							System.out.println("1. Saque               |               2.Deposito");
				int polp = sc.nextInt();
				switch (polp) {
				case 1:
					System.out.println("Qual valor deseja no saque ?");
						double s2 = sc.nextDouble();
							cp.saque(s2);
					break;
				case 2:
					System.out.println("Qual valor deseja Depositar ?");
						double p2 = sc.nextDouble();
							cp.deposito(p2);
					break;
				default:
					System.out.println("Número inválido, tente novamente mais tarde");
				}
				break;
			default:
				System.out.println("Número inválido, tente novamente mais tarde");
			}

			System.out.println("Ainda Deseja Alguma realizar alguma Tarefa?");
			System.out.println("1.Sim               |    			2.Não ");
			Y= sc.nextInt();
			if (Y !=1) {
				
			}
			
		
		}//while
		sc.close();
	}

}
