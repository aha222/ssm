package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.Consumer;

import java.util.List;
import java.util.Map;

public interface ConsumerMapper {
    // 根据姓名和职业来查询客户
    void findConsumerByNameAndJobs(Consumer consumer);

    // 通过姓名或者职业进行查询
    List<Consumer> findConsumerByNameOrJobs(Consumer consumer);

    // 更新客户信息
    int updateConsumerById(Consumer consumer);

    // 根据传入的id数组进行查询
    List<Consumer> selectByIdArray(int[] idArray);

    // 根据传入的map进行查询
    Consumer selectByMap(Map map);

    // 根据传入的id list集合进行查询
    List<Consumer> selectByIdList(List list);
}
