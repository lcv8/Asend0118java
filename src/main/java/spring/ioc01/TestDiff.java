package spring.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class TestDiff {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring01/application.xml");
        Calendar calendar = (Calendar) context.getBean("connection");
        System.out.println(calendar);
    }
}
