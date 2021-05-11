package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class Arco {

    private Elemento e1;
    private Elemento e2;
    private boolean dominante;
    private int valore;

    public Arco(Elemento _e1, Elemento _e2, boolean _dominante, Integer _valore) {
        this.e1 = e1;
        this.e2 = e2;
        this.dominante = dominante;
        this.valore = _valore;
    }
}
