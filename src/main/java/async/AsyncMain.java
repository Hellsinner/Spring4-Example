package async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class AsyncMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AsyncConfig.class);

        AsyncService asyncService = context.getBean(AsyncService.class);
        AsyncServicePlus asyncServicePlus = context.getBean(AsyncServicePlus.class);

        for (int i=0; i < 50; i++){
            asyncService.execSync(i);
            asyncService.execSyncPlus(i);
            asyncServicePlus.run(i);
        }

        for (int i=0; i< 20 ;i++){
            asyncServicePlus.runplus(i);
        }

        context.close();
    }
}
