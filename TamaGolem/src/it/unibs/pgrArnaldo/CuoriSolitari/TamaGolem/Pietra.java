package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class Pietra {

    private int danno;
    private Elemento elemento;

    public Pietra(Elemento elemento) {
        this.elemento = elemento;
    }

    public int getDanno() {
        return danno;
    }

    public Elemento getElemento() {
        return elemento;
    }
}
