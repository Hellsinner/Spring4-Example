package aop.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yanghan on 2019-10-01.
 */
public class Invocation {
    private Object target;

    private Method method;

    private Object[] params;

    public Invocation(Object target, Method method, Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }
}
