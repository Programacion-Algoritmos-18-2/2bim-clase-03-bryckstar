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
public class Prueba {

    public static void main(String[] args) {
        
        CrearArchivoEjemplo prueba = new CrearArchivoEjemplo();
        prueba.abrirArchivo();
        prueba.agregarRegistros();
        prueba.cerrarArchivo();
        
    }

}
