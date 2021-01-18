package mybatis01.testmybatis.dao;

import mybatis01.testmybatis.entitys.Student;
import mybatis01.testmybatis.mapperUtils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.spi.LoggerFactory;

import java.util.List;

public class StudentDao {
    public void add(Student student) throws Exception {
        //得到连接对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try{
            //映射文件的命名空间.SQL片段的ID，就可以调用对应的映射文件中的SQL
            sqlSession.insert("mybatis01.testmybatis.entitys.Student.add",student);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        } finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public Student findAll(int id) throws Exception{
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            return sqlSession.selectOne("mybatis01.testmybatis.entitys.Student.findAdd",id);
        } catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        } finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public List<Student> findAllaLL() throws Exception{
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            return sqlSession.selectList("mybatis01.testmybatis.entitys.Student.findAll");
        } catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        } finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public static void main(String[] args) throws Exception {

        StudentDao studentDao = new StudentDao();

        //add
//        Student student = new Student(2, "deng", 10000D);
//        studentDao.add(student);

        //findAll
//        Student student = new Student();
//        System.out.println(studentDao.findAll(1));

        //findAllall
        List<Student> studens = studentDao.findAllaLL();
        System.out.println(studens.size());

    }
}
