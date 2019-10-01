package aop.example;

import org.springframework.util.StringUtils;

/**
 * Created by yanghan on 2019-10-01.
 */
public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("name is empty");
        }
        System.out.println("hello" + name);
    }
}
