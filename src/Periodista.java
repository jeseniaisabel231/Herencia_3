public class Periodista extends Persona{
    public Periodista(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public Periodista() {
    }

    public Periodista(String cedula, String nombre, String DOB) {
        super(cedula, nombre, DOB);
    }
    public void imprimirSaludo(){
        System.out.println("Hola amigos periodistas");
    }

    @Override

    public double impuesto(double sueldo) {
        this.sueldo =sueldo;
        return this.sueldo * 0.1;
    }
}
