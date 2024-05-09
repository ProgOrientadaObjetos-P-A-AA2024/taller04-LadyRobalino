package paquete2;
public class DatosAutomotor {
    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public DatosAutomotor(String n, String a, int sb, double c) {
        cedula = n;
        marca = a;
        anioFabricacion = sb;
        valorVehiculo = c;
    }

    public DatosAutomotor(String n, String a, int sb) {
        cedula = n;
        marca = a;
        anioFabricacion = 450;
        valorVehiculo = 300;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Automotor\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor vehiculo: %.2f\n"
                + "Valor matricula: %.f\n",
                cedula,
                marca,
                anioFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerAnioFabricacion(int x) {
        anioFabricacion = x;
    }
    
    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }
    
    public void establecerValorMatricula() {
        valorMatricula = 0.002 * anioFabricacion;
    }

    
    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
}
