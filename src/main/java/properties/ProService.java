package properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by yanghan on 2019-09-21.
 */
@Service
public class ProService {
    @Value("${author.name}")
    private String name;

    public void run() {
        System.out.println(name);
    }
}
