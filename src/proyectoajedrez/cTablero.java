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

    public char[][] tablero;

    public cTablero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    public void setTablero() {
        int j = 1;
        for (char i = 'a'; i < 'h'; i++) {
                tablero[0][j] = i;
                tablero[9][j] = i;
                j++;
        }
    }

    public void gestionTablero() {
        
    }

    public void mostrarTablero() {
        for (int row = 0; row < tablero.length; row++) {
            for (int column = 0; column < tablero[row].length; column++) {
                System.out.println(" | "+tablero[row][column] + " | ");
            }
            System.out.println();
        }
    }
}
