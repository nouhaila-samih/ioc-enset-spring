package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("res="+metier.calcul());

    }
}
