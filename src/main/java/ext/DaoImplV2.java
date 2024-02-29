package ext;


import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Vers web service");
        double t =33;
        return t;
    }
}
