package Demo02;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();

        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.add();
    }
}
