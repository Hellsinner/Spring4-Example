package ioc;

/**
 * Created by yanghan on 2019-09-21.
 */
public class IocService {
    private IocDao iocDao;

    public void setIocDao(IocDao iocDao) {
        this.iocDao = iocDao;
    }

    public void run(){
        iocDao.run();
        System.out.println("ioc service");
    }
}
