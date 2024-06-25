package com.springcore.prototype.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PrototypeScopeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/prototype/scope/prototypeScopeconfig.xml");
             PrototypeScopeImpl object1= context.getBean("prototypeScopeImpl",PrototypeScopeImpl.class);
             PrototypeScopeImpl object2= context.getBean("prototypeScopeImpl",PrototypeScopeImpl.class);
             // if we don't declare the Scope of bean , by default it will be Singleton
             // and both object give same hashcode
             System.out.println(object1.hashCode());
             System.out.println(object2.hashCode()); 
	}

}
