package dao;

public class DaoImpl implements IDao {


    public DaoImpl() {}

    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp= 24;
        return temp;
    }
}
