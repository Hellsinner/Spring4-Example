package annoation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class AnnoMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AnnoConfig.class);

        AnnoService annoService = context.getBean(AnnoService.class);
        annoService.run();
    }
}
