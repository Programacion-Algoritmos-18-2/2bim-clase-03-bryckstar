/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Estadio> informacion;

    public void agregarInformacion(ArrayList<Estadio> info) {
        informacion = info;
    }

    public ArrayList<Estadio> obtenerInformacion() {
        return informacion;
    }

    public double obtener_promedio_capacidad() {
        int sum = 0;
        
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            sum += obtenerInformacion().get(i).get_capacidad();
        }

        double prom = (sum / obtenerInformacion().size());
        return prom;
    }

}
