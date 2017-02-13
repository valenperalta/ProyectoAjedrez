/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoajedrez;

import java.util.Scanner;

/**
 *
 * @author valentinam.peralta
 */
public class cPeon extends cTrebejo {

    static Scanner scan = new Scanner(System.in);
    int contador;

    public cPeon() {
        this.numero = 8;
        this.inicial = 'P';
        this.color = " ";
        this.contador = 0;
    }

    public cCelda moverTrebejo() {
        cCelda celda = new cCelda();
        ci.leer();
        cf.leer();
        while (super.validacion() == true) {
            ci.leer();
            cf.leer();
        }
        contador++;
        if (contador > 0) {
            if ((ci.column == cf.column) && (ci.row == cf.row + 1)) {
                celda = cf;
            }
        }
        return celda;
    }
}
