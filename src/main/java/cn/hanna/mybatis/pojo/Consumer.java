package cn.hanna.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;


}
