
package pkg17_s06;

/**
 *
 * @author ander
 */
public class Main {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

   
    Calculadora_17 calculadora = new Calculadora_17();
    calculadora.MostrarNumero();

 
    Estudiante_17 estudiante = new Estudiante_17();
    estudiante.imprimir();
    System.out.println("La edad del estudiante en años es: " + estudiante.MultiplicarEdad());
    System.out.println("La edad del estudiante en meses es: " + estudiante.MultiplicarEdadEnMeses());
  }
}
