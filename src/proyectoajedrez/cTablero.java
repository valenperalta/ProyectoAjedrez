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
public class cTablero {

    public char [][] tablero = new char[9][9];

    public cTablero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void setTablero() {
        int j = 1;
        char i;
        for (i = 'a'; i < 'h'; i++) {
                tablero[0][j] = i;
                tablero[8][j] = i;
                j++;
        }
        /*for (char k = '8'; k > '0'; k--) {//resolver problema
            tablero[k][0] = k;
            tablero[k][8] = k;
        }*/
    }

    public void gestionTablero() {
        
    }

    public void mostrarTablero() {
        System.out.println("-----------------------------------");
        for (int row = 0; row < tablero.length; row++) {
            for (int column = 0; column < tablero[row].length; column++) {
                System.out.print(" | "+tablero[row][column]);
            }
            System.out.println(" |");
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
}
