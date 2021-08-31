import com.dm.mapper.UserMapper;
import com.dm.pojo.User;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void  getUserList() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList= mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void  getUserList2() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = app.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getUserList()) {
            System.out.println(user);
        }
    }

    @Test
    public void  getUserList3() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = app.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.getUserList()) {
            System.out.println(user);
        }
    }
}
