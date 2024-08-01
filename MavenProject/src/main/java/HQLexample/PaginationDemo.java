package HQLexample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Manager;

public class PaginationDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Query q=s.createQuery("from Manager");
		
		//implementing pagination
		
		q.setFirstResult(0);
		q.setMaxResults(2);
		
		List<Manager> list=q.list();
		list.forEach(el->System.out.println(el.getName()));
		
		
		
		s.close();
		
		factory.close();
	}

}
