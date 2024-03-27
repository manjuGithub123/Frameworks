package com.springproject.spring2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("conig.xml");

        Student st=(Student)ctx.getBean("st"); 
        System.out.println(st);
    }
}
