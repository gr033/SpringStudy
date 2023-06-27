package exam03;

public class Member {
	public Member() {
		System.out.println("기본생성자 실행");
	}
	
	public Member(String name) {
		System.out.println("매개변수 갖는 생성자 동작함 \n"+name);
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}
