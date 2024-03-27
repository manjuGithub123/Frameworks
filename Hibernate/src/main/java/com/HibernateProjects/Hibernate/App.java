package com.HibernateProjects.Hibernate;


import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session ss=factory.openSession();
        Transaction trans=ss.beginTransaction();
        Children ch=new Children(10,"aman",20);
        ss.save(ch);
        trans.commit();
        System.out.println("children is saved");
    }
}
