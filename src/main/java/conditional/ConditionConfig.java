package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yanghan on 2019-09-21.
 */
@Configuration
@ComponentScan
public class ConditionConfig {
    @Bean
    @Conditional(LinuxCondition.class)
    public OsService linuxOsService(){
        return new LinuxOsService();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public OsService windowsOsService(){
        return new WindowsOsService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public OsService macOsService(){
        return new MacOsService();
    }
}
