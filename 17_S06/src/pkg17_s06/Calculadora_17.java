
package pkg17_s06;

/**
 *
 * @author ander
 */
public class Calculadora_17 {

  // Atributos
   int a;
   int b;

  // Constructores
  public Calculadora_17() {
    this.a = 17;
    this.b = 17;
  }


  public Calculadora_17(int a, int b) {
    this.a = a;
    this.b = b;
  }
  
  // Métodos
  public void MostrarNumero() {
    System.out.println("a: " + this.a);
    System.out.println("b: " + this.b);
  }

  // Sobrecarga de métodos
  public int sumar(int a, int b) {
    return a + b;
  }

  public int restar(int a, int b) {
    return a - b;
  }

  
  

  public double getA() {
    return this.a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public double getB() {
    return this.b;
  }

  public void setB(int b) {
    this.b = b;
  }
}

