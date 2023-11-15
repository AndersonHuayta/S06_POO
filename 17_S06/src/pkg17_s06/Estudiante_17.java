package pkg17_s06;

/**
 *
 * @author ander
 */
public class Estudiante_17 {
    
     String nombre;
     int edad;
     String carrera;

  //
  public Estudiante_17() {
    this.nombre = "anderson";
    this.edad = 18;
    this.carrera = "Sistemas";
  }

  public Estudiante_17(String nombre) {
    this.nombre = "anderson";
    this.edad = 18;
    this.carrera = "Sistemas";
  }

  public Estudiante_17(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.carrera = "Sistemas";
  }

  public Estudiante_17(String nombre, int edad, String carrera) {
    this.nombre = nombre;
    this.edad = edad;
    this.carrera = carrera;
  }

  // 
  public void imprimir() {
    System.out.println("Su Nombre es : " + this.nombre);
    System.out.println("Su Edad edad: " + this.edad);
    System.out.println("Carrera: " + this.carrera);
  }
 
  public int MultiplicarEdad() {
    return this.edad * 12;
  }

  public int MultiplicarEdadEnMeses() {
    return this.edad * 12 * 30;
  }

 
  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
