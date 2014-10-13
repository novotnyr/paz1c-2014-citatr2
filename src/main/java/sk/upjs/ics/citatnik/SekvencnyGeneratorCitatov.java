package sk.upjs.ics.citatnik;

import java.util.List;

public class SekvencnyGeneratorCitatov implements CitatGenerator {

    private CitatDao citatDao = CitatDaoFactory.INSTANCE.vyrobCitatDao();

    private int index;
    
    @Override
    public Citat generuj() {
        List<Citat> citaty = citatDao.dajVsetky();
        if(index >= citaty.size()) {
            return null;
        }
        Citat citat = citaty.get(index);
        index++;
        return citat;
    }

}
