package ejercicinf;

import java.util.Arrays;

/**
 *
 * @author AlejandroRpdriguezB
 */
public class LListaDNIS {

    //atributos
    private DNI[] array;
    private int contador = 0;

    //constructor
    public LListaDNIS(int MAX) {
        array = new DNI[MAX];
    }

    //metodos
    public void agrega(DNI n) {
        array[contador] = n;
        contador++;
    }

    public void ordena() {
        Arrays.sort(this.getArray()); //este metodo no funcionaria si DNI no implementase Comparable
    }

    //getters y setters
    public DNI[] getArray() {
        return array;
    }

    public void setArray(DNI[] array) {
        this.array = array;
    }

    //to string de la lista
    @Override
    public String toString() {
        String blank = "";
        for (int i = 0; i < array.length; i++) {
            blank += array[i] + "\n";
        }
        return blank;
    }

}
