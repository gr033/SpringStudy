package exam04;

public class BookVO {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public BookVO() {
		super();
	}

	public BookVO(int bookid, String bookname, String publisher, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public void info() {
		System.out.println("*** 도서정보 ***");
		System.out.println("도서번호: "+bookid);
		System.out.println("도서이름: "+bookname);
		System.out.println("출판사명: "+publisher);
		System.out.println("도서가격: "+price);
	}
}
