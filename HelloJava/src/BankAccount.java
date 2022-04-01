public class BankAccount {
		
		private String name;
		private int balance = 0;
		
		
		public int getBalance() { //private ������
			return balance;
		}
		
		public void setName(String newName) { // private ������
			name = newName;
		}
		
		/* public void setName(String name) { // ���������� �Ʒ��� ���� ����
			this.name = name;
		}*/ 
		
		public void writeInfo() {
			System.out.print("������: " + name);
			System.out.println(", �ܾ�: " + balance);
		}
		
		public void deposit(int amount) {
			balance += amount;
		}
		
		public void withdraw(int amount) {
			balance += amount;
		}
}
