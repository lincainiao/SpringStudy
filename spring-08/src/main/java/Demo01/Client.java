package Demo01;

// 客户
public class Client {
    public static void main(String[] args) {
        // 房东要出租房子
        Host host = new Host();
//        host.rent();

        // 代理，帮助房东出租房子，但同时会存在其他的附属操作
        Proxy proxy = new Proxy(host);
        // 客户直接找代理租房，而不需要找房东
        proxy.rent();
    }
}
