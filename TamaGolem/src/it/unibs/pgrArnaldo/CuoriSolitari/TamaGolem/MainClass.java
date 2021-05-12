package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import UniBSFpLib.bin.it.unibs.fp.mylib.UniBSFpLib.src.it.unibs.fp.mylib.InputDati;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("ciao");

        //Chiede di inserire il nome ai giocatori
        String g1 = InputDati.leggiStringaNonVuota(Costanti.NOME_GIOCATORE + "1: ");
        String g2 = InputDati.leggiStringaNonVuota(Costanti.NOME_GIOCATORE + "2: ");

        ArrayList<TamaGolem> tama_golems1 = new ArrayList<>();
        ArrayList<TamaGolem> tama_golems2 = new ArrayList<>();

        //Creazione della squadra del giocatore 1:
        System.out.println(String.format(Costanti.CREA_TAMAGOLEM, g1));
        for(int i=0; i<Costanti.NUM_TAMAGOLEM; i++){
            String nome = InputDati.leggiStringaNonVuota(Costanti.NOME_TAMAGOLEM);
            TamaGolem tama = new TamaGolem(nome, Costanti.HP);
            tama_golems1.add(tama);
        }
        Squadra squadra_1 = new Squadra(g1, tama_golems1);

        //Creazione della squadra del giocatore 2:
        System.out.println(String.format(Costanti.CREA_TAMAGOLEM, g2));
        for(int i=0; i<Costanti.NUM_TAMAGOLEM; i++){
            String nome = InputDati.leggiStringaNonVuota(Costanti.NOME_TAMAGOLEM);
            TamaGolem tama = new TamaGolem(nome, Costanti.HP);
            tama_golems2.add(tama);
        }
        Squadra squadra_2 = new Squadra(g1, tama_golems1);
    }
}
