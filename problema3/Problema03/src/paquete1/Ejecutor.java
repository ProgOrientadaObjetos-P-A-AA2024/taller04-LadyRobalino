package paquete1;
import paquete2.DatosAutomotor;
public class Ejecutor {
    public static void main(String[] args) {
        DatosAutomotor datos1 = new DatosAutomotor("11500234","Tesla", 2004,37000);
        datos1.establecerValorMatricula(); 
        DatosAutomotor datos2 = new DatosAutomotor("11400233", "Toyota", 1990);
        datos2.establecerValorMatricula();
        System.out.printf("%s\n", datos1);
        System.out.printf("%s\n", datos2);
        
    }
    
}
