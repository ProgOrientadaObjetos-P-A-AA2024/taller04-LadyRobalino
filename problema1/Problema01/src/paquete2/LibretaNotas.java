package paquete2;
public class LibretaNotas {

    private String nombreEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        nota1 = c1;
        nota2 = c2;
        nota3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        nota1 = c1;
        nota2 = c2;
        nota3 = 10;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Notas\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.3f\n",
                nombreEstudiante,
                nota1,
                obtenerNota2(),
                nota3,
                obtenerPromedio());
        return cadena;
    }

    public void establecerNombreEstudisnte(String x) {
        nombreEstudiante = x;
    }

    public void establecerNota1(double x) {
        nota1 = x;
    }

    public void establecerNota2(double x) {
        nota1 = x;
    }
    
    public void establecerNota3(double x) {
        nota3 = x;
    }
    
    public void establecePromedio() {
        promedio = (nota1 + obtenerNota2() + nota3) / 3;
    }

    
    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

}
