package paquete2;
public class DatosProfesores {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public DatosProfesores(String n, String a, double sb, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = sb;
        cedula = c;
    }

    public DatosProfesores(String n, String a, double sb) {
        nombre = n;
        apellido = a;
        sueldoBasico = 450;
        cedula = "11023341";
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Profesores\n"
                + "Nombre: %s\n"
                + "Apelllido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s\n",
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula);
        return cadena;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }
    
    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }

    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
}
