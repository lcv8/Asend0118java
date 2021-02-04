package springMybatis;

import mybatis01.testmybatis.associa_1.dao.DeptDao;
import mybatis01.testmybatis.dao.StudentDao;
import mybatis01.testmybatis.entitys.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSqlspring {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springMybatis/spring-mybatis.xml");
//        SqlSessionFactory sessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        SqlSession sqlSession = sessionFactory.openSession();
        DeptDao deptDao = (DeptDao) applicationContext.getBean("deptDao");
        System.out.println(deptDao);
    }
}
