package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.User2;

public interface User2Mapper {

    // 根据用户的id进行查询用户的订单信息
    User2 findOrder2ByUserId(Integer id);

}
