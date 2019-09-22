package conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class ConditionMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        OsService osService = context.getBean(OsService.class);
        osService.dir();
    }
}
