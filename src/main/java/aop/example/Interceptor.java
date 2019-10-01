package aop.example;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by yanghan on 2019-10-01.
 */
public interface Interceptor {

    public boolean before();

    public void after();

    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    public void afterReturning();

    public void afterThrowing();

    boolean useAround();
}
