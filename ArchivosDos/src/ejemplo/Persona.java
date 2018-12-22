/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Bryan
 */
public class Persona {
    
    public Persona(){
        this(0, "");
    }
    
    int edad;
    String nombre;
    
    public void set_edad(int e){
        edad = e;
    }
    
    public void set_nombre(String n){
        nombre = n;
    }
    
    public int get_edad(){
        return edad;
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public Persona(int edad, String nombre){
        set_edad(edad);
        set_nombre(nombre);
    }
    
}
