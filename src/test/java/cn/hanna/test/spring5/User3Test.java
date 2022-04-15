package cn.hanna.test.spring5;

import cn.hanna.spring5.config.MyApplicationConfig;
import cn.hanna.spring5.bean.User3;
import cn.hanna.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User3Test {
    @Test
    public void test(){
//        ClassPathXmlApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("applicationContext.xml");
//        User3 user1 = (User3)applicationContext.getBean("user1");
//        User3 user2 = (User3)applicationContext.getBean("user2");
//        System.out.println(user1);
//        System.out.println(user2);
//        UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceImpl");
//        User3 user = userServiceImpl.findUserById(3);
//        System.out.println(user);
        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
        applicationContext1.getBean("userServiceImpl", UserServiceImpl.class);
    }
}
