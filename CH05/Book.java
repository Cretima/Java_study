
public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author ) {
		this.title = title;
		this.author = author;
	}
	
	public String toStirng() {
		return "제목=" + title + ", 저자=" + author;
	}
	
	
	public void setBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
		
	public void writeInfo() {
		System.out.print("제목: " + title);
		System.out.print(", 저자: " + author);
	}
	
	//책 제목과 저자가 같은지 비교 
	public boolean equals(Book oBook) {
		return title.equals(oBook.title) // title -> this.title
				&& author.equals(oBook.author);
	}
}
