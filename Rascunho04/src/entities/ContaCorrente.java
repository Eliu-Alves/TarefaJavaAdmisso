package entities;

public class ContaCorrente extends Conta {

	public void saque(double y) {
		if (y >= 1000.01) { // Limite do Saque sendo apenas 1000 reais
			System.out.println(" Saques na Conta Corrente apenas valores atê 1000 reais");
			System.out.println("Tente novamente, mais tarde");
		} else {
			saldo -= (y + (y * 0.01)); // para amenizar o tempo converti a porcentagem em decimal
										// e somei na qual sera sacado assim matando 2 coelhos numa paulada so
			System.out.println("Caro cliente devido nossos juros o senhor esta devendo " + getSaldo() + " Reais");
		}
	}

}