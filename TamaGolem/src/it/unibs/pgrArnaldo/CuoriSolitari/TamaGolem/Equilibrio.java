package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import java.util.ArrayList;
import java.util.Random;

public class Equilibrio{

    private static Elemento[] elementi = {Elemento.ACQUA, Elemento.ARIA, Elemento.FUOCO};
    private int potenza;
    private boolean forza;

    /**
     * Estrae un numero intero random tra un minimo e un massimo prefissati
     * @param min
     * @param max
     * @return randomNum
     */
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /**
     * Questo metodo crea l'equilibrio tra i vari elementi esistenti
     */
    public static void creaEquilibrio(){

        int rand = randInt(1, elementi.length);
        for (Elemento e: elementi){
            if(e.getId() == rand){

            }
        }

    }

}
