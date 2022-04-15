package cn.hanna.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
           Reader reader =  Resources.getResourceAsReader("mybatis-config.xml");
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取sqlSession
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    // 关闭sqlSession
    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
