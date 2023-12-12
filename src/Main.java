import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Persona per1=new Persona();
      Persona per2=new Persona("178389447", "Gabriel");
      Persona per3=new Persona("173894894", "Jose", "positivo");

      Deportista dep1 = new Deportista("17389487", "Jose");
      Deportista dep2 = new Deportista();
      Deportista dep3 = new Deportista("17287327", "Maria", "4335634980");


      Periodista perd1 = new Periodista("17389487", "Jose");
      Periodista perd2 = new Periodista();
      Periodista perd3 = new Periodista("17287327", "Maria", "4335634980");

      per1.imprimirSaludo();
      dep1.imprimirSaludo();
      System.out.println("El impuesto a pagar es:  ");
      System.out.println(dep1.impuesto(900));

      perd1.imprimirSaludo();
      System.out.println("El impuesto a pagar es:  ");
      System.out.println(perd1.impuesto(1000));

    }
}