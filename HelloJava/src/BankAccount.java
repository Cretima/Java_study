public class BankAccount {
		
		private String name;
		private int balance = 0;
		
		
		public int getBalance() { //private 접근자
			return balance;
		}
		
		public void setName(String newName) { // private 설정자
			name = newName;
		}
		
		/* public void setName(String name) { // 위에꺼보다 아래껄 많이 쓰임
			this.name = name;
		}*/ 
		
		public void writeInfo() {
			System.out.print("예금주: " + name);
			System.out.println(", 잔액: " + balance);
		}
		
		public void deposit(int amount) {
			balance += amount;
		}
		
		public void withdraw(int amount) {
			balance += amount;
		}
}
