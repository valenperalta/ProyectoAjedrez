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
    int contador;
    int movimiento;
    int cantidad;

    public cPeon() {
        super();
        this.inicial = 'P';
        this.contador = 0;
        this.movimiento = 0;
        this.cantidad = 8;
    }

    public cPeon(int numero) {
        this.color = " ";
        this.numero = numero;
        this.inicial = 'P';
        this.contador = 0;
        this.movimiento = 0;
        this.cantidad = 8;
    }

    @Override
    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        //Verifica si se puede realizar el movimiento para poder llamarlo en tablero
        boolean resp = false;
        if (super.validacion(x1, x2, y1, y2) == false) {
            resp = false;
        }
        if (movimiento == 0) {
            if ((x2 <= (x1 + 2)) && (y2 <= (y1 + 2))) {
                for (int i = x1 + 1; i <= x1 + 2; i++) {
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                        contador++;
                    }
                }
                if (contador == 2) {
                    resp = true;
                    movimiento++;
                }
            }
        } else if (movimiento > 0) {
            if ((x2 <= (x1 + 1)) && (y2 <= (y1 + 1))) {
                for (int i = x1 + 1; i <= x1 + 1; i++) {
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1)) {
                        contador++;
                    }
                }
                if (contador == 1) {
                    resp = true;
                    movimiento++;
                }
            }
        }
        return resp;
    }
}
