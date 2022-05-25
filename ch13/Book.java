package ch13;

public class Book implements Comparable{
	private String bookName;
	private int price;
	
	public Book(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "제목=" + bookName + ", 가격=" + price;
	}
	
	
	@Override
	public int compareTo(Object o) {
		if (o != null && o instanceof Book) {
			Book b = (Book)o;
			// 오름차순
			if (price > b.price)
				return 1;
			else if (price < b.price)
				return -1;
			else
				return 0;
		}
		return -1;
	}

}
