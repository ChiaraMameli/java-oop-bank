package jana60.bank;

public class Main {
	public static void main(String[] args) {
		Conto conto1 = new Conto("Chiara");
		conto1.addMoney(50);
		System.out.println(conto1);
		
		System.out.println("---------------");
		
		Conto conto2 = new Conto("Pippo");
		conto2.addMoney(100);
		conto2.getMoney(50);
		System.out.println(conto2);
		
		System.out.println("---------------");
		
		Conto conto3 = new Conto("Pluto");
		System.out.println(conto3);
		
		
		
	}
}
