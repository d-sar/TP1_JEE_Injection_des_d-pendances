package ext;

import dao.IDAO;

public class DaoImpV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("web service");
        double temp = 23;
        return temp;
    }
}
