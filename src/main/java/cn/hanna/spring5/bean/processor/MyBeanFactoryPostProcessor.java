package cn.hanna.spring5.bean.processor;

import cn.hanna.spring5.bean.User3;
import cn.hanna.spring5.bean.User5;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("userServiceImpl");
        beanDefinition.setAutowireMode(3);
        System.out.println("我是工厂的后置处理器，我会在构造器之前执行");
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(new User5(1,"hh","kk"));
    }
}
