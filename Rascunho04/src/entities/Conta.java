package entities;

public class Conta {

	// declaracao dos metodos que serao herdados pelas outras contas
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposito(double x) {
		saldo += x;
	}

	public void saque(double y) {
		saldo -= y;
	}
}
