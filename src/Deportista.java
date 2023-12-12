public class Deportista extends Persona{
    //constructor con dos parametros
    public Deportista(String cedula, String nombre) {
        super(cedula, nombre);
    }
    //constructo vacio
    public Deportista() {
    }
    //constructor con tres parametros
    public Deportista(String cedula, String nombre, String DOB) {
        this.cedula=cedula;
        this.nombre = nombre;
        this.DOB = DOB;
    }
    public void imprimirSaludo(){
        System.out.println("Hola amigos deportistas");
    }

    //llamar a un metodo dos veces da un error, pero
    //por la sobrecarga de metodos
    public int edad(int valor){
        return 0;
    }

    public double edad(double valor){
        return 1.1;
    }
}
