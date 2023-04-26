package bank;

class BankAccount {
	int accNo = 123;
	String accTitle = "Unknown";
	double accBal = 10.0;
	
	void deposit(double amount) {
		this.accBal = this.accBal + amount;
	}
	void withdraw(double amount) {
		accBal = accBal - amount;
	}
	
	void display() {
		System.out.println("Account Title: " +accTitle + " Account Ballance: " + accBal);
	}
	
	BankAccount(int an, String at, double bl){
		this(an, at);
		this.accBal = bl;
		
		
	}
	BankAccount(){
		
	}
	BankAccount(int an, String at){
		
		accNo = an;
		accTitle = at;
		
	}
	
	
	
	

}
