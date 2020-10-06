package persistentie;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class ObjectStreamManipulaties {

    //Maak methode generiek   
    public      leesObject(File naamBestand) {
        
        try( ){
            return 
        }
        //IOException en ClassNotFoundException
        catch (            ex) {
            Logger.getLogger(ObjectStreamManipulaties.class.getName()).
	   log(Level.SEVERE, null, ex);
        }

        return null;
    } 

    //Maak methode generiek  
    public  List<   > leesObjecten(File naamBestand) {
        
        
        //IOException en ClassNotFoundException
        catch (              ex) {
            Logger.getLogger(ObjectStreamManipulaties.class.getName()).
	   log(Level.SEVERE, null, ex);
        }
        return null;
    }


    
}
