
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setName("������"); // private�� ���� ���� ����(.name) �Ұ��� �����ڸ� ���� �̸� ����.
		account.deposit(200000);
		System.out.println("account�� �ܾ� =" + account.getBalance());
		
	}

}
