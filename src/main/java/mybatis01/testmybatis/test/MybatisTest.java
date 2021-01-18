package mybatis01.testmybatis.test;

import mybatis01.testmybatis.mapperUtils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class MybatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        System.out.println(sqlSession.getConnection()!=null?"success":"fail");
    }
}
