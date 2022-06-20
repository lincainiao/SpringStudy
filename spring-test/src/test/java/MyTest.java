import com.lin.linshi.Photograph;
import com.lin.linshi.Photographer;
import com.lin.pojo.Girls;
import com.lin.pojo.User;
import com.lin.springmybatis.UserMapper;
import com.lin.utils.GirlsConfig;
import com.lin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.SocketTimeoutException;
import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(GirlsConfig.class);
        Girls girls = context.getBean("getGirls", Girls.class);
        System.out.println(girls.toString());
    }

    @Test
    public void photoTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Photograph photograph = context.getBean("photograph", Photograph.class);
        photograph.photograph();
    }

    @Test
    public void getUserListTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
