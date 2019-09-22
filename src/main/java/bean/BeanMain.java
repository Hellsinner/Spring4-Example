package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class BeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        BeanService beanService = context.getBean(BeanService.class);
        beanService.run();
        context.close();
    }
}
