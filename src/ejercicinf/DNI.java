package ejercicinf;

import java.util.Random;

/**
 *
 * @author AlejandroRpdriguezB
 */
public class DNI implements Comparable<DNI> {

    //atributos
    private String DNI;
    private int numero;
    private char letra;

    //to string
    @Override
    public String toString() {
        return DNI;
    }

    //getters y setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumeros() {
        return numero;
    }

    public void setNumeros(int numeros) {
        this.numero = numeros;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    //constructor
    public DNI() {
        this.setNumeros(generaNumero());
        this.setLetra(generaLetra());

        this.DNI = "" + this.numero + this.letra;
    }

    //metodos para generar random los numeros y letras
    private int generaNumero() {

        Random r = new Random();
        int n = r.nextInt(99999999 - 10000000) + 10000000;
        return n;
    }

    private char generaLetra() {
        Random r = new Random();
        int n = r.nextInt(90 - 65) + 65;
        return (char) n;
    }

    //override necesario para implementar el comparable
    @Override
    public int compareTo(DNI t) {
        if (this.numero < t.getNumeros()) {
            return -1;
        } else {
            return 1;
        }
    }

}
