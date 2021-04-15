package entities;

public class ContaPoupanca extends Conta {

	// condicoes iF usadas para conferi e passa pelos requisitos pedido em cada
	// modulo
	public void deposito(double x) {
		if (x >= 200) {
			saldo += x;
			System.out.println("Caro cliente seu saldo agora � de " + getSaldo() + " Reais");
		} else {
			System.out.println(" Depositos na Conta Poupan�a apenas valores de apartir de 200 reais");
			System.out.println("Tente novamente, mais tarde");
		}
	}

	public void saque(double y) {
		if (y >= 500.01) {
			System.out.println(" Saques na Conta Poupan�a apenas valores at� 500 reais");
			System.out.println("Tente novamente, mais tarde");
		} else {
			saldo -= y;
			System.out.println(
					"Caro cliente esta conta n�o possui juros, contudo o senhor deve " + getSaldo() + " Reais");
		}
	}

}
