package cn.hanna.test.mybatis;

import cn.hanna.mybatis.pojo.User2;
import cn.hanna.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class User2Test {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        User2 user = sqlSession.selectOne("findOrder2ByUserId", 1);
        System.out.println(user);
        MybatisUtil.closeSqlSession(sqlSession);
    }
}
