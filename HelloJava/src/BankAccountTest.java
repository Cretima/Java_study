
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setName("정원용"); // private로 인해 직접 선언(.name) 불가능 접근자를 통해 이름 대입.
		account.deposit(200000);
		System.out.println("account의 잔액 =" + account.getBalance());
		
	}

}
