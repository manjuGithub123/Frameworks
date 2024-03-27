package com.spring.project.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new  ClassPathXmlApplicationContext("manju.xml");
    Student s=   (Student)ctx.getBean("st");
    System.out.println(s);
    }
}  