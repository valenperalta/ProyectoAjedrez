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
public abstract class cTrebejo {

    static Scanner scan = new Scanner(System.in);

    protected String color;//el color se lo da el jugador creo q no deberiamos tener color en trebejo talvez si necesitamos color
    protected int numero;
    protected char inicial;
    protected cCelda ci;//no necesito celda en trebejo segun yo le da la posicion cada jugador con una validacion dependiendo del nombre creo
    protected cCelda cf;
    
    public cTrebejo() {
        this.color = " ";
        this.numero = 0;
        this.inicial = ' ';
        this.ci = new cCelda();
        this.cf = new cCelda();
        
        
    }

    public cTrebejo(String color, int numero, char inicial, cCelda c, cCelda c1) {
        this.color = color;
        this.numero = numero;
        this.inicial = inicial;
        this.ci = c;
        this.cf = c1;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void setScan(Scanner scan) {
        cTrebejo.scan = scan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public cCelda getCi() {
        return ci;
    }

    public void setCi(cCelda ci) {
        this.ci = ci;
    }

    public cCelda getCf() {
        return cf;
    }

    public void setCf(cCelda cf) {
        this.cf = cf;
    }

    public void moverTrebejo(cTrebejo t, cCelda cInicial, cCelda cFinal) {
        //no deberia ser un boolean que compruebe si el movimeinto que desea hacer el jugador es posible?
        System.out.print("Ingrese inicial: ");
        this.inicial = scan.next().charAt(0);
    }
    
    public boolean validacion(){
        boolean respuesta = false;
        if(ci.equals(cf)){
            respuesta = true;
        }else {
            respuesta = false;
        }
        return respuesta;
    }
}
