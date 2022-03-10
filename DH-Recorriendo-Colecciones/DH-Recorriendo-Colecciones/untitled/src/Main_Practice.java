import javax.xml.datatype.DatatypeConfigurationException;
import java.util.*;
import java.time.*;

public class Main_Practice {
    public static void main(String[] args) {
        List nombres = new ArrayList();

        nombres.add("Alex");
        nombres.add("Flor");
        nombres.add("Fran");
        nombres.add("Facu");

    /*
    Si hicieramos un Set no se podrian agregar elementos repetidos ni nulos

    HashSet no respeta el orden de insercion.
    LinkedHashSet si respetan el orden de insercion
    TreeSet inserta albabeticamente

    */
        List nombres2 = new LinkedList();
        Set names = new LinkedHashSet();
    }

    Map mascotas = new HashMap();

    mascotas.put(12,"meme");

}
