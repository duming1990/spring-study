import com.dm.pojo.address;
import com.dm.pojo.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    address address = context.getBean("address", address.class);
    System.out.println(address.toString());

//    student student = (student) context.getBean("student");
//    System.out.println(student.toString());
    /*
    student{
      name='杜明',
      address=address{address='天府之国'},
      books=[红楼梦, 水浒传, 三国演义, 西游记],
      hobbys=[听歌, 敲代码, 看电影],
      card={身份证=222222222222222222222,银行卡=666666666666666666666},
      games=[LOL, DOTA],
      info={passWord=123456, sex=男, driver=2021, userName=妖刀},
      wife='null'
    }
     */
  }
}
