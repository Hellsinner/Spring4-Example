package aop;

import org.springframework.stereotype.Service;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
public class AopService {
    public void before(){
        System.out.println("aop service before");
    }

    @AopAnnoation
    public void after(){
        System.out.println("aop service after");
    }
}
