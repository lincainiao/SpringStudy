package Demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过通用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        // 代理角色，这里的proxy就是动态生成的
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
