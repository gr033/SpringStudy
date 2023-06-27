package exam03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Resource resource = new FileSystemResource("beans.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			
			//getBean이 반환하는 자료형은 Object 
			MessageBean mb = (MessageBean)factory.getBean("mb");
			mb.sayHello("gildong");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exam03.HelloApp error: "+e.getMessage());
		}
		MessageBean bean ;
	}
}
