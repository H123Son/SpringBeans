package hunre.edu.dh9c;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	private static ApplicationContext context1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Draw vehinh = new Draw();
//		vehinh.ve();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/spring.xml"));
//		Draw draw = (Draw) factory.getBean("ve");
//		draw.ve();

		context1 = new ClassPathXmlApplicationContext("beans.xml");
		Draw draw = (Draw) context1.getBean("ve");
		draw.ve();
		msgHello msg = (msgHello) context1.getBean("msghello");
		msg.MsgOut();
	}

}
