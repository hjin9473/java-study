package homework8.hw6;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
        sender.withdraw(amount);
        receiver.deposit(amount);
        System.out.println("이체 완료: " + amount + "원");
    }
}
