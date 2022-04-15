package cn.hanna.test.mybatis;

import cn.hanna.mybatis.pojo.Person;
import cn.hanna.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 1.测试一对一联合查询
//         Person person = (Person) sqlSession.selectOne("findIdCardByPersonId", 2);
//        System.out.println(person);
        // 2.
        Person person = (Person) sqlSession.selectOne("findCardByPersonId", 1);
        System.out.println(person);
        MybatisUtil.closeSqlSession(sqlSession);
    }
}
