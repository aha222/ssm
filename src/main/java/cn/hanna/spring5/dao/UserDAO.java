package cn.hanna.spring5.dao;

import cn.hanna.spring5.bean.User3;

public interface UserDAO {

    // 根据id查询用户信息
    User3 findUserById(int id);
}
