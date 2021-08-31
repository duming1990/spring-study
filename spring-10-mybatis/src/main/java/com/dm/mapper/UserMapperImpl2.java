package com.dm.mapper;

import com.dm.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository("userMapper2")
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper  {
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    public List<User> getUserList() {
        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }
}
