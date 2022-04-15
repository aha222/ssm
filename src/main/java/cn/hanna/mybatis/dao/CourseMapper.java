package cn.hanna.mybatis.dao;

import cn.hanna.mybatis.pojo.Course;

public interface CourseMapper {

    // 根据id查询课程
    Course findCourseById(Integer id);
}
