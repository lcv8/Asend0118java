package spring.aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring01/application.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getClass());
        userService.save("xiaoc");
    }
}
