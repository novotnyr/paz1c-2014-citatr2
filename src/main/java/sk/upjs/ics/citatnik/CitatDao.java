package sk.upjs.ics.citatnik;

import java.util.List;

public interface CitatDao {
    
    Citat findById(Long id);
    
    void save(Citat citat);

    int count();
    
    List<Citat> dajVsetky();    
}
