import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象都在Spring中管理，要使用，只要从里面获得即可
        Object hello = context.getBean("hello");
        System.out.println(hello.toString());
    }
}
