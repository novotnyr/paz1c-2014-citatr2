/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.citatnik;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rn
 */
public class DatabazovyCitatDaoTest {
    
    public DatabazovyCitatDaoTest() {
    }

    /**
     * Test of findById method, of class DatabazovyCitatDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = null;
        DatabazovyCitatDao instance = new DatabazovyCitatDao();
        Citat expResult = null;
        Citat result = instance.findById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DatabazovyCitatDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Citat citat = null;
        DatabazovyCitatDao instance = new DatabazovyCitatDao();
        instance.save(citat);
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class DatabazovyCitatDao.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        DatabazovyCitatDao instance = new DatabazovyCitatDao();
        int expResult = 2;
        int result = instance.count();
        assertEquals(expResult, result);
    }

    /**
     * Test of dajNahodnyCitat method, of class DatabazovyCitatDao.
     */
    @Test
    public void testDajNahodnyCitat() {
        System.out.println("dajNahodnyCitat");
        DatabazovyCitatDao instance = new DatabazovyCitatDao();
        Citat expResult = null;
        Citat result = instance.dajNahodnyCitat();
        System.out.println(result);
        //assertEquals(expResult, result);
    }
    
}
