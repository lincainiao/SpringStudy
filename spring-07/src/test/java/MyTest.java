import com.lin.Config.LinConfig;
import com.lin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        // �����ȫʹ�������࣬��Ҫ��AnnotationConfigApplicationContext�����Ļ�ȡ������ͨ���������class�������
        ApplicationContext context = new AnnotationConfigApplicationContext(LinConfig.class);
        User user = (User) context.getBean("getUser"); // ��ӦConfig.java�еķ�����
        System.out.println(user.toString());
    }

}
