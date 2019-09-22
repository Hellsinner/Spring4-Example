package ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by yanghan on 2019-09-21.
 */
@Configuration
//@ComponentScan("ioc")
@ImportResource("classpath:application.xml")
public class IocConfig {
    @Bean
    public IocService iocService(IocDao iocDao) {
        IocService iocService = new IocService();
        iocService.setIocDao(iocDao);
        return iocService;
    }
}
