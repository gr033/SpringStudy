package exam13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("환경설정파일 읽기 전..................................................");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam13/beans13.xml");
		System.out.println("환경설정파일 읽은 후..................................................");
		Member m1 = (Member)context.getBean("member");
		System.out.println("m1 가져온 후");
		Member m2 = (Member)context.getBean("member");
		System.out.println("m2 가져온 후");
		
		if(m1==m2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}
}
