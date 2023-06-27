package exam02;

public class Member {
	public Member() {
		System.out.println("기본생성자 실행");
	}
	
	public Member(String name) {
		System.out.println("기본생성자 아님");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}
