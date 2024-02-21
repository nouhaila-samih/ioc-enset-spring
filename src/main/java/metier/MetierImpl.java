package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao d;

    public MetierImpl(IDao d) {
        this.d = d;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double i= d.getData();
                return i*3;
    }

    @Override
    public void setDao(IDao d) {
        this.d=d;

    }
}
