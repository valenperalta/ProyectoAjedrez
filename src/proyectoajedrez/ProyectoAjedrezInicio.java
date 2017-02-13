/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoajedrez;

/**
 *
 * @author valentinam.peralta
 */
public class ProyectoAjedrezInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cTablero t = new cTablero();
        t.setTablero();
        t.setTrebejosCelda();
        t.mostrarTablero();

        cCelda c1 = new cCelda();
        cCelda c2 = new cCelda();
        cPeon p = new cPeon();

        t.setmTrebejo();
        t.mostrarTablero();
    }

}
