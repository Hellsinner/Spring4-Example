package profile;

/**
 * Created by yanghan on 2019-09-21.
 */
public class ProfileService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name);
    }
}
