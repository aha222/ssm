package cn.hanna.test.mybatis;

import cn.hanna.mybatis.dao.StudentMapper;
import cn.hanna.mybatis.pojo.Student;
import cn.hanna.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 嵌套结果查询
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        Student coursesByStuId = mapper.findCoursesByStuId(1);
//        System.out.println(coursesByStuId);

        // 嵌套查询
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student stu = mapper.findCoursesByStuId2(1);
        System.out.println(stu);
        MybatisUtil.closeSqlSession(sqlSession);
    }
}
