package Demo01;

// �ͻ�
public class Client {
    public static void main(String[] args) {
        // ����Ҫ���ⷿ��
        Host host = new Host();
//        host.rent();

        // ���������������ⷿ�ӣ���ͬʱ����������ĸ�������
        Proxy proxy = new Proxy(host);
        // �ͻ�ֱ���Ҵ����ⷿ��������Ҫ�ҷ���
        proxy.rent();
    }
}
