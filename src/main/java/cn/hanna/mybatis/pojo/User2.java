package cn.hanna.mybatis.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User2 {

    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList; // 用户关联订单
}
