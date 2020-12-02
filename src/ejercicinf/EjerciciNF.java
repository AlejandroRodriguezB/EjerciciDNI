package ejercicinf;

/**
 *
 * @author AlejandroRpdriguezB
 */
public class EjerciciNF {

    public static void main(String[] args) {
        //numero de dnis que quieres generar y una lista de dicha longitud
        final int MAX = 10000;
        LListaDNIS array = new LListaDNIS(MAX);
        //generamos el nuero deseado de dnis y los añadimos a la lista
        for (int i = 0; i < MAX; i++) {
            DNI dni = new DNI();
            array.agrega(dni);
        }
        //ordenamos la lista y la imprimimos
        array.ordena();
        System.out.println("Los DNI generados son: \n" + array);
        //guardamos el resultado en un fichero de texto
        EscriureFitxer ef = new EscriureFitxer("DNIS.txt");
        ef.escriure(array);
        ef.tancar();
    }

}
