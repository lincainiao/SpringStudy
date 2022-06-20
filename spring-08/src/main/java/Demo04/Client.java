package Demo04;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        // 真实角色
        UserServiceImpl service = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(service);


        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();

    }
}
