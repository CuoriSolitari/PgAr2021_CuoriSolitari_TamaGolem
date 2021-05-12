package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class Pietra {

    private String nome;
    private int danno;
    private Elemento elemento;

    public Pietra(String nome, Elemento elemento) {
        this.nome = nome;
        this.elemento = elemento;
    }

    public int getDanno() {
        return danno;
    }
}
