package com.springproject.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx =new  ClassPathXmlApplicationContext("config.xml");
   Laptop l1=(Laptop) ctx.getBean("lp1");
   Laptop l2=(Laptop) ctx.getBean("lp2");
   Laptop l3=(Laptop) ctx.getBean("lp3");
    
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
   
        
    }
    
}
