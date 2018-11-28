package com.qy.dao.impl;

import com.qy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/11/28.
 */
@Repository
public class Userdaoimpl implements java.io.Serializable{
    @Autowired
    private HibernateTemplate hibernateTemplate;
    public List<User> findAll(){
        List<User> list=hibernateTemplate.loadAll(User.class);
        return  list;
    }
}
