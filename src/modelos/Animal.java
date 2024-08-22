package modelos;

public class Animal {
    public int edad;
    public String sexo;
    public String nombre;
    
    public void correr(){
        System.out.println("Soy el "+nombre+" y estoy corriendo!!!");
    }
    
    public void comer(){
        System.out.println("Soy el "+nombre+" y estoy comiendo!!!!");
    }
}