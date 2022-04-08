
public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("", "");
		Book b2 = new Book("", "");
		
		b1.setBook("벌레 이야기", "이청준");
		b2.setBook("벌레 이야기", "이청준");
		b1.writeInfo();
		b2.writeInfo();
		
		//책이 같은지 비교, equals 호출
		
		//false : 문자열은 같을지라도 해당 문자열이 저장된 객체(주소)가 다르기에
		System.out.println("b1==b2: " + (b1==b2)); 
		
		//true : 객체 String 메소드인 equals를 사용하여 객체가 달라도 문자열이 같으면 참 반환
		System.out.println("b1.equals(b2) : " + b1.equals(b2));

	}

}
