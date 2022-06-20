import com.lin.dao.BlogMapper;
import com.lin.dao.UserMapper;
import com.lin.dao.UserMapperImpl;
import com.lin.pojo.Blog;
import com.lin.pojo.User;
import com.lin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void getUserListTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        for (User user : userMapper.getUserListById(map)) {
            System.out.println(user);
        }

//        BlogMapper blogMapper = context.getBean("blogMapper", BlogMapper.class);
//        for (Blog blog : blogMapper.getBlogList()) {
//            System.out.println(blog);
//        }
    }
}
