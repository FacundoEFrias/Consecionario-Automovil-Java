
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    //Agrega un Automovil
    public void agregarAutomovil(Automovil automovil) {
        autoJpa.create(automovil);
    }
    
    //Traer todos los regristros que hay de Autos
    public List<Automovil> traerAutos() {
       return autoJpa.findAutomovilEntities();
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil cargarDatosAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void editarAutomovil(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
