package aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yanghan on 2019-10-01.
 */
public class ProxyBean implements InvocationHandler {
    private Object target;

    private Interceptor interceptor;

    public ProxyBean(Object target, Interceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    public static Object getProxyBean(Object target, Interceptor interceptor) {
        ProxyBean proxyBean = new ProxyBean(target, interceptor);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), proxyBean);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Invocation invocation = new Invocation(target, method, args);
        boolean exceFlag = false;
        Object retObj = null;
        try {
            if (interceptor.before()) {
                retObj = interceptor.around(invocation);
            } else {
                retObj = method.invoke(target, args);
            }
        } catch (Exception e) {
            exceFlag = true;
        }
        interceptor.after();
        if (exceFlag) {
            interceptor.afterThrowing();
        } else {
            interceptor.afterReturning();
            return retObj;
        }
        return null;
    }
}
