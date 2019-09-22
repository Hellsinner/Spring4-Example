package properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class ProMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProConfig.class);
        ProService proService = context.getBean(ProService.class);
        proService.run();
    }
}
