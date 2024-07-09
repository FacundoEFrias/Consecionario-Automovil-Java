
package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        
        //Llamamos y hacemos visible nuestra IGU
        Principal prin = new Principal();
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
    }
}
