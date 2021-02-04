package spring.aop01.goingto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop01.goingto.service.DeptService;

public class TestAop02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring01/spring-aop.xml");
        DeptService deptService = (DeptService) context.getBean("deptService");
        System.out.println(deptService.getClass());
        deptService.find("zhans");
    }
}
