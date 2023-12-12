public class Panadero extends Persona{
    public Panadero(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public Panadero() {
    }

    public Panadero(String cedula, String nombre, String DOB) {
        super(cedula, nombre, DOB);
    }
    public void imprimirSaludo(){
        System.out.println("Hola amigos panaderos");
    }
    @Override
    public double impuesto(double sueldo) {
        return this.sueldo * 0.1;
    }
}
