package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by yanghan on 2019-09-21.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ProfileService devService() {
        ProfileService profileService = new ProfileService();
        profileService.setName("dev");
        return profileService;
    }

    @Bean
    @Profile("prod")
    public ProfileService prodService() {
        ProfileService profileService = new ProfileService();
        profileService.setName("prod");
        return profileService;
    }
}
