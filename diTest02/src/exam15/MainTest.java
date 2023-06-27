package exam15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("exam15/beans15.xml");
	SystemMonitor sm = (SystemMonitor) context.getBean("sm");
	sm.monitor();
}
