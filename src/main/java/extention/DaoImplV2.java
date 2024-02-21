package extention;

import dao.IDao;

public class DaoImplV2 implements IDao {
    public DaoImplV2() {}
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp= 19;
        return temp;
    }
}
