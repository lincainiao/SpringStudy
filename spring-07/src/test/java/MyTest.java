import com.lin.Config.LinConfig;
import com.lin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        // 如果完全使用配置类，需要用AnnotationConfigApplicationContext上下文获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(LinConfig.class);
        User user = (User) context.getBean("getUser"); // 对应Config.java中的方法名
        System.out.println(user.toString());
    }

}
