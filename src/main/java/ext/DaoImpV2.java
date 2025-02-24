package ext;

import dao.IDAO;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("web service");
        double temp = 23;
        return temp;
    }
}
