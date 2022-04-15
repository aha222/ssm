package cn.hanna.spring5.bean;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TestAspectj {

    public void test(){
        System.out.println("我是测试方法......");
    }
}
