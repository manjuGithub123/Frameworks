package com.springwiringproject.spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("manju.xml");
            Trainer tr=(Trainer)ctx.getBean("tr");
      System.out.println(tr);
      
      Trainer tr1=(Trainer)ctx.getBean("tr1");
      System.out.println(tr1);
      
      Kodcls ko=(Kodcls)ctx.getBean("ko");
      System.out.println(ko);
    }
}
