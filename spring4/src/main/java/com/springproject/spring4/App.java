package com.springproject.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx= new  ClassPathXmlApplicationContext("manju.xml");
   Emp e=(Emp)ctx.getBean("em");
   System.out.println(e);
    }
}
