package paquete1;
import paquete2.DatosProfesores;
public class Ejecutor {
    public static void main(String[] args) {
        DatosProfesores datos1 = new DatosProfesores("Lady","Robalino", 500,"115002314");
        datos1.establecerSueldoTotal(); 
        DatosProfesores datos2 = new DatosProfesores("Angel", "Alvarez", 450);
        datos2.establecerSueldoTotal();
        System.out.printf("%s\n", datos1);
        System.out.printf("%s\n", datos2);
        
    }
    
}
