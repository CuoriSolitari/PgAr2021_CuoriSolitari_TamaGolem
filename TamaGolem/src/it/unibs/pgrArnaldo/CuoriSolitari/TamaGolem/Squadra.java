package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import java.util.ArrayList;

public class Squadra {

    private String nome_giocatore;
    private ArrayList<TamaGolem> tamagolem;

    public Squadra(String nome_giocatore, ArrayList<TamaGolem> tamagolem) {
        this.nome_giocatore = nome_giocatore;
        this.tamagolem = tamagolem;
    }
}
