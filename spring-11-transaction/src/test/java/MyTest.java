import com.lin.dao.UserMapper;
import com.lin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.AllPermission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void updateTest(){
        UserMapper mapper = context.getBean(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",10086);
        int i = mapper.updateUserById(map);
        System.out.println(i);
    }

    @Test
    public void addTest(){
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.addUser(new User(7,"zhao","123456"));
    }
}
