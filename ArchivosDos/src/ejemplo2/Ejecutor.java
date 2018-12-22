/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import ejemplo.*;

/**
 *
 * @author Bryan
 */
public class Ejecutor {

    public static void main(String[] args) {

        OperacionData operacion = new OperacionData();
        LeerArchivoTexto2 p = new LeerArchivoTexto2();
        p.abrirArchivo();
        operacion.agregarInformacion(p.leerRegistros());

        System.out.printf("El promedio de las capacidades de los estadios es de: %.2f\n", operacion.obtener_promedio_capacidad());
        p.cerrarArchivo();

    }

}
