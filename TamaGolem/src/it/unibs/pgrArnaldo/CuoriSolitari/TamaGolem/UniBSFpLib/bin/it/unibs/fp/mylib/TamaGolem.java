package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib;

import java.util.ArrayList;

public class TamaGolem {

    private String nome;
    private int vita;
    private ArrayList<Pietra> pietre;

    public TamaGolem(String nome, int vita, ArrayList<Pietra> pietre) {
        this.nome = nome;
        this.vita = vita;
        this.pietre = pietre;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public ArrayList<Pietra> getPietre() {
        return pietre;
    }

    public void setPietre(ArrayList<Pietra> pietre) {
        this.pietre = pietre;
    }
}
