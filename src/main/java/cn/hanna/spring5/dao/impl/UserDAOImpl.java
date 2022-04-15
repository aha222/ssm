package cn.hanna.spring5.dao.impl;

import cn.hanna.spring5.dao.UserDAO;
import cn.hanna.spring5.bean.User3;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {

    @Override
    public User3 findUserById(int id) {
        // 模拟进行查询
        return new User3(3,"xiaoHua","64534534234");
    }
}
