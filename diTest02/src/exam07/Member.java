package exam07;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Member() {
		super();
	}
	 
	public void info() {
		System.out.println("이름: "+name+", 나이: "+age);
	}
}
