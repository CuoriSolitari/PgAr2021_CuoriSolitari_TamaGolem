package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib;

import java.util.ArrayDeque;
import java.util.Deque;

public class Battaglia {

    private boolean vincitore;
    private int fase;
    private static TamaGolem esausto;

    /**
     * Fa scontrare due tamagolem fino a quando uno non è esusto e lo ritorna
     *
     * @param t1
     * @param t2
     * @return
     */
    public static TamaGolem combattimento(TamaGolem t1, TamaGolem t2){

        Deque<Pietra> pietre1 = new ArrayDeque<>();
        Deque<Pietra> pietre2 = new ArrayDeque<>();

        //Inizializza la deque di pietre1
        for(int i=0; i<t1.getPietre().size(); i++){
            pietre1.add(t1.getPietre().get(i));
        }
        //Inizializza la deque di pietre2
        for(int i=0; i<t2.getPietre().size(); i++){
            pietre2.add(t1.getPietre().get(i));
        }

        while(t1.getVita() > 0 && t2.getVita() >0){

        }
        return esausto;
    }
}
