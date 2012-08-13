/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waranty.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lieven
 */
public class WarantyStore {
    private final File storeDir;
    //return new File(MyClass.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    public WarantyStore(File storeDir)
    {
        this.storeDir = storeDir;
    }
    
    public List<Waranty> load() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Object res ;
        try (FileInputStream fos = new FileInputStream( storeDir + File.separator + "store.dat" )) {
            ObjectInputStream outStream = 
       new ObjectInputStream( fos );
            res = outStream.readObject();
            outStream.close();
        }
        return (List<Waranty>)res;
    }
    public void store(List<Waranty> waranty) throws FileNotFoundException, IOException
    {
            FileOutputStream fos = new FileOutputStream( storeDir + File.pathSeparator + "store.dat" );
             ObjectOutputStream outStream = 
        new ObjectOutputStream( fos );
             outStream.writeObject(waranty);
             outStream.close();
             fos.close();
    }
    
    
    
    public void uploadImage(File source)
    {
        
    }
}
