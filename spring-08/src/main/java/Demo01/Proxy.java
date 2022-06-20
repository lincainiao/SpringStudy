package Demo01;

import javax.annotation.PreDestroy;

// 代理
public class Proxy implements Rent{
    // 代理对象
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }

    // 代理，帮房东出租房子
    @Override
    public void rent() {
        host.rent();
        // 附属操作
        this.watchHouse();
        this.contract();
        this.fare();
    }
    // 代理能做，但房东不能做
    public void watchHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void contract(){
        System.out.println("签租赁合同");
    }
}
