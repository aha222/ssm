package cn.hanna.spring5.service;

import cn.hanna.spring5.bean.User3;

public interface UserService {

    // 根据id查询用户信息
    User3 findUserById(int id);
}
