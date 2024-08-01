package HQLexample;
import com.hibernate.Manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hibernate HQL example starting......" );
        
		// 1: Create Configuration object
		Configuration cfg=new Configuration();
		// 2:Implenent hibernate config xml file
        cfg.configure("hibernate.cfg.xml");
        
        // 3: create session factory object
        SessionFactory factory=cfg.buildSessionFactory();
        
      Session session=  factory.openSession();
      
        String query="from Manager";   // Select * from Manager
      
        Query q=   session.createQuery(query);
        
        List<Manager> list=q.list();
        
        for(Manager manager:list) {
        	System.out.println(manager.getName());
        }
        
        session.close();
        factory.close();

	}

}
