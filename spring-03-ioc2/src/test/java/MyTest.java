import com.wei.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user=(User) context.getBean("user");
        User user1= (User) context.getBean("user");
        System.out.println(user==user1);
        user.show();
    }
}
