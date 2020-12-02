package ejercicinf;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlejandroRodriguezB
 */
public class EscriureFitxer {

    //atributo
    private FileWriter fw;

    //constructor
    public EscriureFitxer(String fitxer) {

        try {
            fw = new FileWriter(fitxer);
        } catch (IOException ex) {
            Logger.getLogger(EscriureFitxer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //escrivimos la lista
    public void escriure(LListaDNIS j) {

        try {
            fw.write(j.toString());
        } catch (IOException ex) {
            Logger.getLogger(EscriureFitxer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //cerramos el file writer
    public void tancar() {

        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EscriureFitxer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
