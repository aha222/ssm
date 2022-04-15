package cn.hanna.spring5.service.impl;

import cn.hanna.spring5.bean.*;
import cn.hanna.spring5.dao.UserDAO;
import cn.hanna.spring5.service.UserService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Aspect
public class UserServiceImpl implements UserService {

    // 注入UserDAOImpl
    @Autowired
    private UserDAO userDAOImpl;

    private UserServiceImpl(User1 user1, User2 user2, User4 user4, User5 user5){
        System.out.println("private 4.....");
    }

    private UserServiceImpl(User1 user1, User4 user4){
        System.out.println("private 2.....");
    }

    public UserServiceImpl(User1 user1, User2 user2, User3 user3){
        System.out.println(" public 3 constructor.....");
    }

    public UserServiceImpl(User1 user1,User2 user2){
        System.out.println("public two constructors.....");
    }

    @Override
    public User3 findUserById(int id) {
        User3 userById = userDAOImpl.findUserById(id);
        return userById;
    }
}
