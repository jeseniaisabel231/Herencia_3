public class Persona {
    String cedula;
    String nombre;
    String DOB;
    String tipodeSangre;
    double sueldo;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public Persona(){
    }

    public Persona(String cedula, String nombre, String DOB) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.DOB = DOB;
    }
    public void imprimirSaludo(){
        System.out.println("Hola a todos");
    }
    public double impuesto(double sueldo){
        return sueldo * 0.25;
    }
}
