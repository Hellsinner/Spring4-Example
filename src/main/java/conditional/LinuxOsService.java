package conditional;

/**
 * Created by yanghan on 2019-09-21.
 */
public class LinuxOsService implements OsService{
    public void dir() {
        System.out.println("ls");
    }
}
