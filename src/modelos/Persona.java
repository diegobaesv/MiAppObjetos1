
package modelos;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private int altura;
    private int peso;
    private float imc;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getImc() {
        this.imc = peso/(altura*altura);
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
   
    
    
    public void cantar(){
        System.out.println("Hola soy "+nombre+" y estoy cantando!! EOO!!");
    }
}
