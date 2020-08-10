package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class Test {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) throws InterruptedException {
        applicationContext =
                new AnnotationConfigApplicationContext(Test.class);
        TestBean bean=applicationContext.getBean("testBean",TestBean.class);
        System.out.println(bean.pMusic());


        }



    }
