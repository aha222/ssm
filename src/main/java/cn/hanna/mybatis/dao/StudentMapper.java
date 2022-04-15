package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.Student;

public interface StudentMapper {

    // 根据学生id查询，学生的选课情况
    Student findCoursesByStuId(Integer id);

    Student findCoursesByStuId2(Integer id);
}
