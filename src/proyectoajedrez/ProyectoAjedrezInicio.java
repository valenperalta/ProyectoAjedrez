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
        while ((t.j1.cantidadTrebejos != 0) || (t.j2.cantidadTrebejos != 0)) {

            t.setmTrebejo();
            t.mostrarTablero();
        }
    }
}
