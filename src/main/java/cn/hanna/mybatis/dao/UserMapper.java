package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    // 查询全部用户
    List<User> findAll();

    // 根据id查询指定用户
    User selectById(int id);

    // 插入数据
    boolean addUser(User user);

    // 更新数据
    boolean updateUserById(User user);

    // 删除数据
    boolean deleteByUid(int uid);
}
