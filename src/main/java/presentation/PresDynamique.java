package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            // LIGNE 1
            String daoName = scanner.nextLine();
            Class cDao = Class.forName(daoName);
            IDao d = (IDao) cDao.getConstructor().newInstance();
            System.out.println(d.getData());

            //LIGNE 2
            String metierName =  scanner.nextLine();
            Class cMetier = Class.forName(metierName);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            //LIGNE 3
            Method setD = cMetier.getDeclaredMethod("setDao",IDao.class);
            setD.invoke(metier,d);
            System.out.println("res : "+metier.calcul());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
