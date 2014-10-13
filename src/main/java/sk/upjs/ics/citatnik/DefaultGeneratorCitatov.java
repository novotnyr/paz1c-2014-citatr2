package sk.upjs.ics.citatnik;

import java.util.Collections;
import java.util.List;

public class DefaultGeneratorCitatov implements CitatGenerator {
    private CitatDao citatDao = CitatDaoFactory.INSTANCE.vyrobCitatDao();
    
    @Override
    public Citat generuj() {
        List<Citat> citaty = citatDao.dajVsetky();
        Collections.shuffle(citaty);
        
        if(citaty.isEmpty()) {
            return null;
        }
        return citaty.get(0);
    }
        
}
