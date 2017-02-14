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
public class cTablero {
    
    static Scanner scan = new Scanner(System.in);
    
    private cTrebejo[][] tablero = new cTrebejo[10][10];
    protected cJugador j1, j2;
    private boolean disponible;
    
    public cTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = new cTrebejo();
            }
        }
        j1 = new cJugador("blanco");
        j2 = new cJugador("negro");
    }
    
    public void setTablero() {
        int j = 1;
        char i;
        for (i = 'a'; i <= 'h'; i++) {
            tablero[0][j].setInicial(i);
            tablero[9][j].setInicial(i);
            j++;
        }
        j = 1;
        for (char k = 56; k > 48; k--) {
            tablero[j][0].setInicial(k);
            tablero[j][9].setInicial(k);
            j++;
        }
    }
    
    public void gestionTablero() {
        
    }
    
    public void mostrarTablero() {
        
        for (int row = 0; row < tablero.length; row++) {
            for (int column = 0; column < tablero[row].length; column++) {
                System.out.print(" | " + tablero[row][column].inicial);
            }
            System.out.println(" |");
            System.out.println();
            if (row != 9) {
                System.out.println("-------------------------------------------");
            }
        }
    }
    
    public void checkDisponibilidad() {
        
    }
    
    public void setTrebejosCelda() {
        int j = 7;
        
        tablero[8][3] = new cAlfil();
        tablero[8][6] = new cAlfil();
        tablero[8][1] = new cTorre();
        tablero[8][8] = new cTorre();
        tablero[8][2] = new cCaballo();
        tablero[8][7] = new cCaballo();
        tablero[8][4] = new cReina();
        tablero[8][5] = new cRey();
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = new cPeon();
        }
        j = 2;
        tablero[1][3] = new cAlfil();
        tablero[1][6] = new cAlfil();
        tablero[1][1] = new cTorre();
        tablero[1][8] = new cTorre();
        tablero[1][2] = new cCaballo();
        tablero[1][7] = new cCaballo();
        tablero[1][4] = new cReina();
        tablero[1][5] = new cRey();
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = new cPeon();
        }
    }
    
    public void setmTrebejo() {
        int trebejo;
        cCelda celda = new cCelda();
        System.out.println("Que trebejo desea mover?");
        trebejo = scan.nextInt();
        celda = j1.p[trebejo].moverTrebejo();
        //tablero[Character.getNumericValue(celda.row)][Character.getNumericValue(celda.column)] = j1.p[trebejo].inicial;
        //tablero[Character.getNumericValue(celda.row + 1)][Character.getNumericValue(celda.column)] = ' ';
    }
}
