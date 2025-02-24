package metier;

import dao.DaoImp;
import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")

public class MetierImp implements Imetier {

    // coublage faible
    private IDAO dao ; // polymorphisme => private IDAO dao = new DaoImp();

 public MetierImp() {
this.dao = new DaoImp();
 }
    public MetierImp(@Qualifier("dao2") IDAO dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }

// pour injecter dans la variable dao un objet d une classe qui implemente l interface IDao
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
