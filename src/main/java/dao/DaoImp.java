package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImp implements IDAO{

    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double temp = 23;
        return temp;
    }
}
