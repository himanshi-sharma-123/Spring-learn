package org.example;

import org.example.service.PaymentService;
import org.example.service.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObj = context.getBean("payment", PaymentService.class);
        paymentObj.makePayment(123);
    }
}
