package exam02;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanJP();
		//인터페이스를 이용했으므로 클래스 대 클래스보다는 조금 더 느슨해졌지만
		//여전히 객체를 생성하는 부분은 고쳐야 함
		
		bean.sayHello("gildong");
	}
}