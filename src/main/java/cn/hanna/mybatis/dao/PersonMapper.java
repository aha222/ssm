package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.Person;

public interface PersonMapper {

    // 根据person的id，查询出person的身份号码
    Person findIdCardByPersonId(Integer id);

    // 根据person的id，查出他的card属性类
    Person findCardByPersonId(Integer id);
}
