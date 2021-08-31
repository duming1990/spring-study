package com.dm.mapper;

import com.dm.pojo.User;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper {
    //原来我们所有操作都是用sqlsession执行，现在都使用sqlSessionTemplate
    @Autowired
    SqlSessionTemplate sqlSession;

//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession=sqlSession;
//    }

    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();
    }


}
