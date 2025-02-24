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
}
