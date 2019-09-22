package bean;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
public class BeanService {
    @PostConstruct
    public void init(){
        System.out.println("init BeanService");
    }
    public void run(){
        System.out.println("BeanService");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy BeanService");
    }
}
