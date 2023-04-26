package bank;

class EntryPoint {

	public static void main(String args[]) {
		
		
		BankAccount ac1 = new BankAccount(12345, "Abdul Wahab", 100.0);
		BankAccount ac2 = new BankAccount();
		BankAccount ac3 = new BankAccount(4567, "Dawood");
		
		ac1.deposit(50000.0);
		ac1.withdraw(60000);
		
		ac1.display();
		ac2.display();
		ac3.display();
	}

}
