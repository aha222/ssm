package cn.hanna.test.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class UserTest {
    @Test
    public void selectById(){
        String resource = "mybatis-config.xml";
        // 创建流
        Reader reader = null;
        // 读取配置文件中的内容到流对象中
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建sqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 创建sqlSession实例
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 传入参数查询返回结果,根据id进行查询
//        User user = (User)sqlSession.selectOne("selectById", 1);
        // 输出结果
//        System.out.println(user.getUname());
        // 查询全部的结果集
//        List<User> findAll =sqlSession.selectList("findAll");
//        for(User e:findAll){
//            System.out.println(e);
//        }
//        // 插入数据,插入操作中并无插入主键，并且主键为自增操作，数据库自动回滚导致插入失败
//        User user = new User();
//        user.setUname("刘六");
//        user.setUage(45);
//        int res = sqlSession.insert("addUser", user);
//        sqlSession.commit(); // 手动提交
//        System.out.println(res);
//        System.out.println(user);
        // 更新数据
//        User user = new User(6,"刘小小",45);
//        int result = sqlSession.update("updateUserById", user);
//        sqlSession.commit(); // 更新操作也需要手动提交,否则也会回滚
//        System.out.println(result);
        // 删除数据
//        int result = sqlSession.delete("deleteByUid", 6);
//        sqlSession.commit(); // 手动提交
//        System.out.println(result);
        // 关闭session
        sqlSession.close();

    }

}
