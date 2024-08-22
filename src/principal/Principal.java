package principal;

import modelos.Persona;
import modelos.Animal;

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Programa iniciado!!");
        
        Animal perro = new Animal();
        perro.edad = 3;
        perro.nombre = "Bobby";
        perro.sexo = "Macho";
        
        Animal gato = new Animal();
        gato.edad = 2;
        gato.nombre = "Pelusa";
        gato.sexo = "Macho";
        
        perro.comer();
        gato.correr();
        
        //Crear una clase persona con atributos(5) y metodos(2), y crear 2 objetos a partir de ella
        Persona persona = new Persona();
        persona.altura = 170;
        persona.apellido = "Flores";
        persona.nombre = "Juan";
        persona.edad = 20;
        persona.nacionalidad = "Peruano";
        
        persona.cantar();
    }
}
