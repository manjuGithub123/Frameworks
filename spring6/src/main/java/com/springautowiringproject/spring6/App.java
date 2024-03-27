package com.springautowiringproject.spring6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("manju.xml");
    Person p=(Person)ctx.getBean("per");
    System.out.println(p);
    }
}
