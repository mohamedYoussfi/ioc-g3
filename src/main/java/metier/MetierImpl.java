package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao =null ; // couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = 234 *t;
        return res;
    }
/*
Pour injecter dans la variable dao
un objet d'une classe qui implémente IDao
 */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
