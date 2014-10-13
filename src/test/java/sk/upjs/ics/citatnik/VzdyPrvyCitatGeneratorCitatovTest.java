package sk.upjs.ics.citatnik;

import org.junit.Test;
import static org.junit.Assert.*;

public class VzdyPrvyCitatGeneratorCitatovTest {
    @Test
    public void test() {
        VzdyPrvyCitatGeneratorCitatov generator = new VzdyPrvyCitatGeneratorCitatov();
        Citat citat = generator.generuj();
        assertEquals(Long.valueOf(1L), citat.getId());
    }
    
}
