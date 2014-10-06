package sk.upjs.ics.citatnik;

public interface CitatDao {
    
    Citat findById(Long id);
    
    void save(Citat citat);

    int count();

    Citat dajNahodnyCitat();
    
}
