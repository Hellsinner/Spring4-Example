package schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
public class ScheduleService {
    @Scheduled(fixedRate = 5000)
    public void run(){
        System.out.println("ScheduleService run");
    }

    @Scheduled(cron = "0 55 22 ? * *")
    public void cron(){
        System.out.println("ScheduleService cron");
    }
}
