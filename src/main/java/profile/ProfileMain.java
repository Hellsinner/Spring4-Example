package profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yanghan on 2019-09-21.
 */
public class ProfileMain {
    public static void main(String[] args) {
//        System.setProperty("spring.profiles.active", "dev");
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(ProfileConfig.class);
//        ProfileService profileService = context.getBean(ProfileService.class);
//        profileService.run();
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        ProfileService profileService = context.getBean(ProfileService.class);
        profileService.run();
    }
}
