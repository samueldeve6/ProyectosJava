package estructurasdedatosdemo2;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class TablaHash {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Hashtable donald  = new Hashtable();

	donald.put("Nombre","Donald");
	donald.put ("ciudad","Patolandia");

	System.out.println("Personaje : " + donald.get("Nombre"));
	System.out.println("Vive en: " + donald.get("ciudad"));
    }
    
}
