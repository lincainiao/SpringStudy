package Demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成并得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.seeHouse();
        // 动态代理的本质就是反射实现
        Object result = method.invoke(rent, args);
        this.fare();
        return result;
    }

    // 代理能做的事
    public void seeHouse(){
        System.out.println("看房子");
    }
    public void fare(){
        System.out.println("收钱");
    }
}
