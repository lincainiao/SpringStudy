package Demo03;

public class Client {
    public static void main(String[] args) {
        // ��ʵ��ɫ
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // ͨ��ͨ�ó������ɫ����������Ҫ���õĽӿڶ���
        pih.setRent(host);
        // �����ɫ�������proxy���Ƕ�̬���ɵ�
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
