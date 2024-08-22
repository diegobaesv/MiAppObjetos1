package modelos;

public class Cliente extends Persona {
    private String categoria;
    private String codigo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void generarCodigo(){
        //primera letra nombre, primera letra apellido y su edad
        this.codigo = String.valueOf(getNombre().charAt(0)) + String.valueOf(getApellido()).charAt(0) + "_"+ getEdad();
    }
    
    public static void saludar(){
        System.out.println("Hola soy el metodo estatico de cliente");
    }
    
    
}
