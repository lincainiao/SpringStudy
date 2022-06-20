package Demo01;

import javax.annotation.PreDestroy;

// ����
public class Proxy implements Rent{
    // �������
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }

    // �����﷿�����ⷿ��
    @Override
    public void rent() {
        host.rent();
        // ��������
        this.watchHouse();
        this.contract();
        this.fare();
    }
    // ����������������������
    public void watchHouse(){
        System.out.println("�н���㿴��");
    }
    public void fare(){
        System.out.println("���н��");
    }
    public void contract(){
        System.out.println("ǩ���޺�ͬ");
    }
}
