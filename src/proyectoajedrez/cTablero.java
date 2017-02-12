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
    protected cJugador j1, j2;
    private boolean disponible;

    public cTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = ' ';
            }
        }
        j1 = new cJugador("blanco");
        j2 = new cJugador("negro");
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
        for (char k = 56; k > 48; k--) {
            tablero[j][0] = k;
            tablero[j][9] = k;
            j++;
        }
    }

    public void gestionTablero() {
        
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
        int j=7;
        
        tablero[8][3] = j1.a[0].inicial;
        tablero[8][6] = j1.a[1].inicial;
        tablero[8][1] = j1.t[0].inicial;
        tablero[8][8] = j1.t[1].inicial;
        tablero[8][2] = j1.c[0].inicial;
        tablero[8][7] = j1.c[1].inicial;
        tablero[8][4] = j1.re.inicial;
        tablero[8][5] = j1.r.inicial;
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = j1.p[i-1].inicial;
        }
        j = 2;
        tablero[1][3] = j2.a[0].inicial;
        tablero[1][6] = j2.a[1].inicial;
        tablero[1][1] = j2.t[0].inicial;
        tablero[1][8] = j2.t[1].inicial;
        tablero[1][2] = j2.c[0].inicial;
        tablero[1][7] = j2.c[1].inicial;
        tablero[1][4] = j2.re.inicial;
        tablero[1][5] = j2.r.inicial;
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = j2.p[i-1].inicial;
        }
    }
}
