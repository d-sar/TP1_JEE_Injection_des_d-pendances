package metier;

import dao.DaoImp;
import dao.IDAO;

public class MetierImp implements Imetier {
    // coublage faible
    private IDAO dao ; // polymorphisme => private IDAO dao = new DaoImp();
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
