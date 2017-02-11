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
public class cCelda {

    private char row, column;
    private cTrebejo tre;

    public cCelda() {
        this.row = ' ';
        this.column = ' ';
    }

    public cCelda(char row, char column) {
        this.row = row;
        this.column = column;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public cTrebejo getTre() {
        return tre;
    }

    public void setTre(cTrebejo tre) {
        this.tre = tre;
    }

    @Override
    public String toString() {
        return "cCelda{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cCelda other = (cCelda) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

}
