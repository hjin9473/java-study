package homework8.hw6;

public class Main {
	public static void main(String[] args) {
		Account ac1 = new Account("123-456-789",100000);
		Account ac2 = new Account("987-654-321",50000);
				
		Bank bank = new Bank();
		
		ac1.withdraw(30000);


		ac2.deposit(100000);

        bank.transfer(ac1, ac2, 50000);
        
        System.out.println("\n=== 최종 계좌 정보 ===");
        System.out.println(ac1.getaccountNumber() + " 잔액: " + ac1.getbalance() + "원");
        System.out.println(ac2.getaccountNumber() + " 잔액: " + ac2.getbalance() + "원");
	    

	}

}
