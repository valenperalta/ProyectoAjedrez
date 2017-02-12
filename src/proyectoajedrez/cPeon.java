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

    public cPeon() {
        this.numero = 8;
        this.inicial = 'P';
        this.color = " ";
    }

    public void moverTrebejo(cPeon p) {
       ci.leer();
       cf.leer();
       while(super.validacion() == true){
          ci.leer();
          cf.leer();
       }
    }

}
