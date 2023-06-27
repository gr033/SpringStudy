package exam10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("exam10/beans10.xml");
		SystemMonitor monitor = (SystemMonitor)context.getBean("sm");
		monitor.monitor();
	}
}
