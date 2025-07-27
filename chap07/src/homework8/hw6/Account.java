package homework8.hw6;

public class Account {
	String accountNumber;
	int balance;
	
	Account() {
		
	}
	Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
	    this.balance = balance;
	}
	
	String getaccountNumber() {
		return accountNumber;
	}
	int getbalance() {
		return balance;
	}
	
	void deposit(int amount) {
		 balance += amount;
         
		
	}
	void withdraw(int amount) {
		balance -= amount;
        
	}
	
	
	
	

}
