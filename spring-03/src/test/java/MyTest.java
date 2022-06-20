import com.lin.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
//        user.show();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 在getBeans时会创建对象
//        User user = (User) context.getBean("user");
//        user.show();

        User user = (User) context.getBean("zhizhi");
        user.show();

        User user2 = (User) context.getBean("u2");
        user2.show();
    }
}
