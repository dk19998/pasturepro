package com.qy;

import com.qy.dao.impl.Userdaoimpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/11/28.
 */
public class Test {
    @org.junit.Test
    public void test(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Userdaoimpl userdaoimpl=beanFactory.getBean(Userdaoimpl.class);
        userdaoimpl.findAll();
    }
}
