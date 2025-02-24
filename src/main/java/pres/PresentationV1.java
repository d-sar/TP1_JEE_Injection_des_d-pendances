package pres;

import dao.DaoImp;
import ext.DaoImpV2;
import metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args) {

        // Injection des dependonces par instanciation statique

        DaoImpV2 d = new DaoImpV2(); // new = couplage fort
        MetierImp m = new MetierImp(d); // injection via constructeur
       //  m.setDao(d); Injection via le setter
        System.out.println("resultat "+m.calcule());
    }
}
