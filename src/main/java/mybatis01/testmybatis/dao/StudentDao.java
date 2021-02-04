package mybatis01.testmybatis.dao;

import mybatis01.testmybatis.entitys.Student;
import mybatis01.testmybatis.mapperUtils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.spi.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void delectById(int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        try {
            sqlSession.delete("mybatis01.testmybatis.entitys.Student.deleteById",id);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        } finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public void update(Student student){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            sqlSession.update("mybatis01.testmybatis.entitys.Student.updateById",student);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        } finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public List<Student> pagination(int start , int end){
        Map<String,Object> map = new HashMap();
        map.put("start",start);
        map.put("end",end);
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
           return sqlSession.selectList("mybatis01.testmybatis.entitys.Student.pagination",map);
        } catch (Exception e) {
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
//        List<Student> studens = studentDao.findAllaLL();
//        System.out.println(studens.size());

        //delectById
//        studentDao.delectById(2);

        //update

//        studentDao.update(new Student(1,"mi",100D));

        System.out.println(studentDao.pagination(0, 2));
    }
}
