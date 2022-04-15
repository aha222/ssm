package cn.hanna.test.spring5;

import cn.hanna.spring5.pojo.HelloSpring;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringTest {

    @Test
    public void test(){
        // 初始化spring容器，加载applicationContext.xml配置
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取helloSpring容器
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.toString());
    }
}
