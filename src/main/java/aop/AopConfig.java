package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yanghan on 2019-09-21.
 */
@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
