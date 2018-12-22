/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author Bryan
 */
public class Estadio {
    
    String nombre;
    int capacidad;
    String tipo;

    public Estadio(){
        
    }
    
    public void set_nombre(String n) {
        nombre = n;
    }

    public void set_capacidad(int c) {
        capacidad = c;
    }

    public void set_tipo(String t) {
        tipo = t;
    }

    public String get_nombre() {
        return nombre;
    }

    public int get_capacidad() {
        return capacidad;
    }

    public String get_tipo() {
        return tipo;
    }
    
    public Estadio(String n , int c, String t){
        set_nombre(n);
        set_capacidad(c);
        set_tipo(t);
    }
    
}
