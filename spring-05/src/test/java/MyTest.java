import com.lin.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.interfaces.ECPrivateKey;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.getCat().shout();
        person.getDog().shout();
    }

    @Test
    public void autoWiredTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
