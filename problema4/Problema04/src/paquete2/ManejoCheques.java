package paquete2;
public class ManejoCheques {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public ManejoCheques(String n, String a, double v) {
        nombreCliente = n;
        nombreBanco = a;
        valorCheque = v;
    }

    public ManejoCheques(String n, String a) {
        nombreCliente = n;
        nombreBanco = a;
        valorCheque = 14500;
    }

    @Override
    public String toString() {
        String cadena = String.format("Manejo de cheques\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor Cheque: %d\n"
                + "Comision: %.2f\n",
                nombreCliente,
                nombreBanco,
                valorCheque,
                comision);
        return cadena;
    }

    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }

    public void establecerNombreBanco(String x) {
        nombreBanco = x;
    }

    public void establecerValorCheque(double x) {
        valorCheque = x;
    }
    
    public void establecerComision() {
        comision = valorCheque * 0.003;
    }
    

    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }
    
}
