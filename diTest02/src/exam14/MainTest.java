package exam14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("exam14/beans14.xml");
		JobExecutor je = (JobExecutor) context.getBean("je");
		System.out.println("OK");
	}	
}
