
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil automovil = new Automovil();
        automovil.setModelo(modelo);
        automovil.setMarca(marca);
        automovil.setMotor(motor);
        automovil.setColor(color);
        automovil.setPatente(patente);
        automovil.setCantPuertas(cantPuertas);
        
        controlPersi.agregarAutomovil(automovil);
    }

    public List<Automovil> traerAutos() {
       
        return controlPersi.traerAutos();
    }

    public void eliminarAuto(int idAuto) {
       controlPersi.eliminarAuto(idAuto);
    }

    public Automovil cargarDatosAuto(int idAuto) {
        return controlPersi.cargarDatosAuto(idAuto);
    }

    public void editarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        //le pido que modifique a la persistencia
        controlPersi.editarAutomovil(auto);
    }
    
}
