package org.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // ApplicationContext is an Interface, we can't instantiate it, but ClassPathXmlApplicationContext extends ApplicationContext interface, so we can instantiate through it.
        Dev obj = context.getBean(Dev.class); // searching by Name
//        Dev obj = (Dev) context.getBean("dev"); // searching by type  // name dev will return object that why write Dev before context.getBeans()
//        obj.setAge(18);
//        System.out.println(obj.getAge());
        obj.build();


    }
}
