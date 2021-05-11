package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import java.util.ArrayList;

public class Equilibrio{

    private static Elemento[] elementi = {Elemento.ACQUA, Elemento.ARIA};
    private int potenza;
    private boolean forza;

    /**
     * Questo metodo crea l'equilibrio tra i vari elementi esistenti
     */
    public static void creaEquilibrio(){

        int rand = Math.subtractExact(1,2);
        for (Elemento e: elementi){
            if(e.getId() == rand){

            }
        }

    }

}
