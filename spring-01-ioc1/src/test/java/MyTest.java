import com.dm.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  public static void main(String args[]) {

    //    UserService userService = new UserServiceImpl();
    //    ((UserServiceImpl) userService).setUserDao(new UserMysqlDaoImpl());
    //    userService.getUser();

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
    userService.getUser();
  }
}
