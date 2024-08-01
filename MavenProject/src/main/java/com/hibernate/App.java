package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Project starting......" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Manager manager=new Manager("Ankit",100,"Adminstration");
        Session session=factory.openSession();
        System.out.println(manager);
        Transaction tx=   session.beginTransaction();
        //session.save(manager); 
        session.persist(manager); // same as save()
        tx.commit();
    
     /*
      * using get() to fetch object from Entity class
      * get() first check in session cache for object,  if you call same obj twice it will not create again, it will provide refernce from session cache
      * in output you'll see query run only once
      * */
     
      
       
        // try load() to fetch object, it will fetch the object on calling session.load()
        // but will not run query until you use that object

        
        
       session.close();
       factory.close();
        
        
         
    }
}
