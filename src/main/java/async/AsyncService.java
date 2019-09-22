package async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
@Async
public class AsyncService {
    public void execSync(int i) {
        System.out.println("我是异步任务" + i);
    }

    public void execSyncPlus(int i){
        System.out.println("我是异步任务+1," + i);
    }
}
