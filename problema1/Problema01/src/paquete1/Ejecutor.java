package paquete1;
import paquete2.LibretaNotas;
public class Ejecutor {
    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Lady", 10, 8, 9);
        libreta1.establecePromedio(); /* Cuando tenemos una operacion en este
        caso calcular promedio NO OLVIDAR LLAMAR AL METODO para que pueda 
        calcular, en ambos objeto se debe llamar
        */
        LibretaNotas libreta2 = new LibretaNotas("Lady", 10, 7);
        libreta2.establecePromedio();
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
        
    }
    
}
