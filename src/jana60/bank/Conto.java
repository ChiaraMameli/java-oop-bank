package jana60.bank;

import java.util.Random;

public class Conto {
//	numero conto - int
//	nome proprietario - String
//	saldo - int
	
	public int conto;
	private int saldo;
	public String proprietario;
	
	public Conto(String proprietario) {
		Random rnd = new Random();
		
		this.conto = rnd.nextInt(100000000, 1000000001);
		this.saldo = 0;
		this.proprietario = proprietario;
	}
	
	public int getConto() {
		return conto;
	}

	public int getSaldo() {
		return saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public int addMoney(int value) {
		if(!(value < 0))
			saldo += value;
		return saldo;
	}
	
	public int getMoney(int value) {
		
		if(saldo > value)
			saldo -= value;
		return saldo;
	}
	
	@Override
		public String toString() {
			
			return "Nome proprietario: " + proprietario
					+ "\nNumero conto: " + conto
					+ "\nSaldo: " + saldo;
		}
	
}
