
package modelos;

public class Empleado extends Persona {
    
    private String tipoContrato;
    private float sueldo;

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    
    public void calcularSueldo(){
        //si tipo contrato es planilla debe ser 1500, sino 1200
        if("Planilla".equals(tipoContrato)){
            sueldo = 1500;
        } else {
            sueldo = 1200;
        }
        
    }
    
}
