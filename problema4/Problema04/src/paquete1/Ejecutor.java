package paquete1;
import paquete2.ManejoCheques;
public class Ejecutor {
    public static void main(String[] args) {
        ManejoCheques manejo1 = new ManejoCheques("Lady Robalino","Pichincha", 20000);
        manejo1.establecerComision(); 
        ManejoCheques manejo2 = new ManejoCheques("Ana Ruiz", "Loja");
        manejo2.establecerComision();
        System.out.printf("%s\n", manejo1);
        System.out.printf("%s\n", manejo2);
    }
    
}
