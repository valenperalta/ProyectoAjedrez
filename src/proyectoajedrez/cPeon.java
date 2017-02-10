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
public class cPeon extends cTrebejo{
    
    static Scanner scan = new Scanner(System.in);

    public cPeon() {
        super();
    }
    
    public void moverTrebejo(cPeon p,cCelda cInicial,cCelda cFinal){
        System.out.print("Ingrese inicial: ");
        this.inicial = scan.next().charAt(0);
        System.out.println(this.inicial);
    }
    
    
}
