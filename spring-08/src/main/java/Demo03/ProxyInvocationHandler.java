package Demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// ��������Զ����ɴ�����
public class ProxyInvocationHandler implements InvocationHandler {

    // ������Ľӿ�
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // ���ɲ��õ��������
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    // �������ʵ���������ؽ��
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.seeHouse();
        // ��̬����ı��ʾ��Ƿ���ʵ��
        Object result = method.invoke(rent, args);
        this.fare();
        return result;
    }

    // ������������
    public void seeHouse(){
        System.out.println("������");
    }
    public void fare(){
        System.out.println("��Ǯ");
    }
}
