package properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by yanghan on 2019-09-21.
 */
@Configuration
@PropertySource(value = "classpath:propertie.properties")
@ComponentScan("properties")
public class ProConfig {
}
