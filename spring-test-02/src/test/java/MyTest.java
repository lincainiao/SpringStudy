import com.lin.config.MybatisConfig;
import com.lin.dao.UserMapper;
import com.lin.pojo.User;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);
        UserMapper mapper = context.getBean("getUserMapper", UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void t() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        Resource mybatisConfig = new InputStreamResource(inputStream);
        System.out.println(mybatisConfig.exists());
        InputStream inputStream1 = Resources.getResourceAsStream("com/lin/dao/UserMapper.xml");
        Resource mapperConfig = new InputStreamResource(inputStream1);
        System.out.println(mapperConfig.exists());
    }
}
