package async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
public class AsyncServicePlus {
    @Async
    public void run(int i) {
        System.out.println("异步任务plus" + i);
    }

    public void runplus(int i){
        System.out.println("异步任务plus+1, " + i);
    }
}
