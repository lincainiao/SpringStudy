import com.lin.service.UserService;
import com.lin.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println("======================");
        userService.select();
    }
}
