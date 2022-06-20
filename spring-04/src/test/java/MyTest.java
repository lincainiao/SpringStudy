import com.lin.pojo.Girls;
import com.lin.pojo.Student;
import com.lin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.print("name : ");
        System.out.println(student.getName());
        System.out.println("===============================");

        System.out.println("address : ");
        System.out.println(student.getAddress().toString());
        System.out.println("===============================");

        System.out.println("books : ");
        for (String book : student.getBooks()) {
            System.out.println(book);
        }
        System.out.println("===============================");

        System.out.println("hobbies : ");
        for (String hobby : student.getHobbies()) {
            System.out.println(hobby);
        }
        System.out.println("=================================");

        System.out.println("others : ");
        for (Map.Entry<String,Object> entry : student.getOthers().entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("===============================");

        System.out.println("games : ");
        for (String game : student.getGames()) {
            System.out.println(game);
        }
        System.out.println("================================");

        System.out.println("wife : ");
        System.out.println(student.getWife());
        System.out.println("===============================");

        System.out.println("properties : ");
//        Properties properties = new Properties();
        System.out.println(student.getInfo());

    }

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
    @Test
    public void girlsTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girls girls = context.getBean("girls", Girls.class);
        System.out.println(girls.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = context.getBean("userSingleton", User.class);
        User user2 = context.getBean("userSingleton", User.class);
        System.out.println(user1.hashCode() == user2.hashCode()); // true

        user1 = context.getBean("userPrototype",User.class);
        user2 = context.getBean("userPrototype",User.class);
        System.out.println(user1 == user2);// false
    }
}
