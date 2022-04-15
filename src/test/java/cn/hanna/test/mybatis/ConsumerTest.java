package cn.hanna.test.mybatis;

import cn.hanna.mybatis.pojo.Consumer;
import cn.hanna.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class ConsumerTest {
    @Test
    public void test(){
        // 根据姓名和职业查找客户
        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        Consumer consumer = new Consumer(1, "jack", "worker",
//                "12345678");
//        Consumer consumer1 = (Consumer)sqlSession.selectOne("findConsumerByNameAndJobs", consumer);
//        System.out.println(consumer1);

        // 根据姓名或者职业或者电话进行查询
//        Consumer consumer = new Consumer(2, null, null, "124565789");
//        List<Consumer> consumer2 =  sqlSession.selectList("findConsumerByNameOrJobs", consumer);
//        System.out.println(consumer2);

        // 根据id进行更新
//        Consumer consumer3 = new Consumer(1,"lili","worker","098766543");
//        sqlSession.update("updateConsumerById",consumer3);
//        sqlSession.commit();

        // 根据id数组进行查询
//        List<Consumer> consumers = sqlSession.selectList("selectByIdArray", new int[]{1, 2, 3});
//        for(Consumer consumer:consumers){
//            System.out.println(consumer);
//        }

        // 根据map进行查询
//        Map<String, Object> map = new HashMap<>();
//        Integer[] ins = new Integer[]{1,2,3};
//        map.put("jobs","teacher");
//        map.put("ids",ins);
//        Consumer consumer = (Consumer) sqlSession.selectOne("selectByMap", map);
//        System.out.println(consumer);

        // 根据List集合进行查询
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Consumer> consumerList = sqlSession.selectList("selectByIdList", list);
        for(Consumer consumer:consumerList){
            System.out.println(consumer);
        }
        MybatisUtil.closeSqlSession(sqlSession);


    }
}
