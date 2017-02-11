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
    protected cCelda c;//no necesito celda en trebejo segun yo le da la posicion cada jugador con una validacion dependiendo del nombre creo

    public cTrebejo() {
        this.color = " ";
        this.numero = 0;
        this.inicial = ' ';
        this.c = new cCelda();
    }

    public cTrebejo(String color, int numero, char inicial, cCelda c) {
        this.color = color;
        this.numero = numero;
        this.inicial = inicial;
        this.c = c;
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

    public cCelda getC() {
        return c;
    }

    public void setC(cCelda c) {
        this.c = c;
    }

    public void moverTrebejo(cTrebejo t, cCelda cInicial, cCelda cFinal) {
        //no deberia ser un boolean que compruebe si el movimeinto que desea hacer el jugador es posible?
        System.out.print("Ingrese inicial: ");
        this.inicial = scan.next().charAt(0);
    }
}
