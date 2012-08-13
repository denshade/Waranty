/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waranty.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Lieven
 */
public class WarantyStoreTest {
    
    public WarantyStoreTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of load method, of class WarantyStore.
     */
    @Test
    public void testLoad() throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("load");
        WarantyStore instance = new WarantyStore(new File("store"));
        List<Waranty> expResult = new ArrayList<>();
        Waranty w = new Waranty();
        w.setDescription("description1");
        w.setExpireDate(new Date());
        w.setPrice(200.0);
        expResult.add(w);
        
        Waranty w2 = new Waranty();
        w2.setDescription("description2");
        w2.setExpireDate(new Date(2012,7,12));
        w2.setPrice(300.0);
        expResult.add(w2);
        instance.store(expResult);
        
        List result = instance.load();
        assertEquals(expResult, result);
    }

   
    
  
}
