package JavaBeanConfigurationWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "JavaBeanConfigurationWithoutXML")
public class JavaConfig {
//	public StudentBean student;

	@Bean("student")
	public StudentBean getStudentBean() {

		return new StudentBean();
	}

}
