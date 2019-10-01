package aop.example;

/**
 * Created by yanghan on 2019-10-01.
 */
public class Test {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();

        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());

        proxy.sayHello("world");

        proxy.sayHello(null);
    }
}
