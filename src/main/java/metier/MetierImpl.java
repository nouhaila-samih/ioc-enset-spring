package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao d;

    public MetierImpl(IDao d) {
        this.d = d;
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
