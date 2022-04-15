package cn.hanna.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer sid; // 学生id
    private String sname; // 学生姓名
    private List<Course> courses; // 学生选课列表
}
