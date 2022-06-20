import com.lin.dao.UserDaoImpl;
import com.lin.dao.UserMysqlDaoImpl;
import com.lin.service.UserService;
import com.lin.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        // 用户调用业务层，而业务调用Dao层，用户不会直接调用Dao层
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService) .setUserDao(new UserDaoImpl());
//        userService.getUser();

        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImplOfMysqlDao");
        userService.getUser();

        UserServiceImpl userService1 = (UserServiceImpl) context.getBean("userServiceImplOfUserDao");
        userService1.getUser();

    }
}
