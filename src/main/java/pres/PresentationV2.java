package pres;

import dao.IDAO;
import metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args)  {
        try{
            Scanner scan = new Scanner(new File("config.txt"));
            String daoClassname = scan.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDAO dao = (IDAO) cDao.getConstructor().newInstance(); // comme new instance

            String metierClassname = scan.nextLine();
            Class cMetier = Class.forName(metierClassname);
            // par constructeur
            //Imetier metier = (Imetier) cMetier.getConstructor(IDAO.class).newInstance(dao); // comme new instance

            // par setter metier.setDao(d)
            Imetier metier = (Imetier) cMetier.getConstructor().newInstance();
            Method setDao = cMetier.getMethod("setDao", IDAO.class);
            setDao.invoke( metier,dao);

System.out.println("RES = " +metier.calcule());

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
