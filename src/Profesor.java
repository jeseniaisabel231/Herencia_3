public class Profesor extends Persona{
    public Profesor(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public Profesor() {
    }

    public Profesor(String cedula, String nombre, String DOB) {
        super(cedula, nombre, DOB);
    }
    public void imprimirSaludo(){
        System.out.println("Hola amigos profesores");
    }
    @Override
    public double impuesto(double sueldo) {
        return this.sueldo * 0.1;
    }
}
