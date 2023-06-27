package exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01/beans01.xml");
		MemberDAO dao = (MemberDAO)context.getBean("dao");
		dao.insert();
	}
}
