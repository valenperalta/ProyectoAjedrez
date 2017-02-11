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

    private char[][] tablero = new char[10][10];
    private cJugador j1, j2;
    private boolean disponible;

    public cTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void setTablero() {
        int j = 1;
        char i;
        for (i = 'a'; i <= 'h'; i++) {
            tablero[0][j] = i;
            tablero[9][j] = i;
            j++;
        }
        j = 1;
        for (char k = 56; k > 48; k--) {//resolver problema
            tablero[j][0] = k;
            tablero[j][9] = k;
            j++;
        }
    }

    public void gestionTablero() {
        while ((j1.cantidadTrebejos != 0) || (j2.cantidadTrebejos != 0)) {

        }
    }

    public void mostrarTablero() {

        for (int row = 0; row < tablero.length; row++) {
            for (int column = 0; column < tablero[row].length; column++) {
                System.out.print(" | " + tablero[row][column]);
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

    }
}
