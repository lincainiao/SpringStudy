package Demo04;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        // ��ʵ��ɫ
        UserServiceImpl service = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // ����Ҫ����Ķ���
        pih.setTarget(service);


        // ��̬���ɴ�����
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();

    }
}
