package JavaBeanConfigurationWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// ClassPathXmlApplicationContext
		Service service = context.getBean("service", Service.class);
		System.out.println(service);
		service.display();

		StudentBean student = context.getBean("student", StudentBean.class);
		System.out.println(student);
		student.show();
	}

}
