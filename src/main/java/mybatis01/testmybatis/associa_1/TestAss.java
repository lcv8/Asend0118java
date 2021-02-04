package mybatis01.testmybatis.associa_1;

import mybatis01.testmybatis.associa_1.dao.CardDao;
import mybatis01.testmybatis.associa_1.dao.DeptDao;
import mybatis01.testmybatis.associa_1.entity.Card;
import mybatis01.testmybatis.associa_1.entity.Dept;
import mybatis01.testmybatis.mapperUtils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestAss {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
 //       CardDao mapper = sqlSession.getMapper(CardDao.class);
//        List<Card> allCard = mapper.getAllCard();
//        allCard.forEach(card -> {
//            System.out.println(card + " --address :" + card.getAddress());
//        });
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        List<Dept> allDept = mapper.getAllDept();
        allDept.forEach(dept -> {
            System.out.println("部门：" + dept);
            System.out.println("员工：" + dept.getEmps());
        });
    }
}
