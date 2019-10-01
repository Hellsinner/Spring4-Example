package aop.example;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by yanghan on 2019-10-01.
 */
public class MyInterceptor implements Interceptor{
    public boolean before() {
        System.out.println("before");
        return true;
    }

    public void after() {
        System.out.println("after");
    }

    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("aroundBefore");
        Object proceed = invocation.proceed();
        System.out.println("aroundAfter");
        return proceed;
    }

    public void afterReturning() {
        System.out.println("afterReturning");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    public boolean useAround() {
        return true;
    }
}
