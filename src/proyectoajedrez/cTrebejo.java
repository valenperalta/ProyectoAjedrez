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
    
    protected String color;
    protected int numero;
    protected int row, column;
    protected char inicial;
   protected  cCelda c;
    
    public cTrebejo(){
        this.color = " ";
        this.numero = 0;
        this.row = 0;
        this.column = 0;
        this.inicial = ' ';
        this.c = new cCelda();
    }

    public cTrebejo(String color, int numero, int row, int column, char inicial, cCelda c) {
        this.color = color;
        this.numero = numero;
        this.row = row;
        this.column = column;
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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
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
    
    public void moverTrebejo(cTrebejo t,cCelda cInicial,cCelda cFinal){
        System.out.print("Ingrese inicial: ");
        this.inicial = scan.next().charAt(0);
    }
}
