package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Battaglia {

    private static TamaGolem esausto;

    /**
     * Fa scontrare due tamagolem fino a quando uno non è esusto e lo ritorna
     *
     * @param t1
     * @param t2
     * @return
     */
    public static TamaGolem combattimento(TamaGolem t1, TamaGolem t2, int[][] mat){

        int turno = 0;
        while(t1.getVita() > 0 && t2.getVita() >0) {

            System.out.println(t1.getNome() + " usa " + t1.getPietre().get(0).getElemento().getNome());
            System.out.println(t2.getNome() + " usa " + t2.getPietre().get(0).getElemento().getNome());

            int danno = mat[t1.getPietre().get(0).getElemento().getId() - 1][t2.getPietre().get(0).getElemento().getId() - 1];
            if (danno > 0){
                t2.setVita(t2.getVita() - danno);
                System.out.println(String.format(Costanti.DANNO, t2.getNome(), danno, t1.getNome()));
            } else{
                t1.setVita(t1.getVita() + danno);
                System.out.println(String.format(Costanti.DANNO, t1.getNome(), -danno, t2.getNome()));
            }

            System.out.println(t1.getNome() + " ha ora " + t1.getVita() + "HP");
            System.out.println(t2.getNome() + " ha ora " + t2.getVita() + "HP\n\n");

            //Fa "girare" le pietre all'interno dell'arraylist
            t1.getPietre().add(t1.getPietre().get(0));
            t1.getPietre().remove(0);
            t2.getPietre().add(t2.getPietre().get(0));
            t2.getPietre().remove(0);

            //ritrda l'esecuzione di 5 secondi per visualizzare tutto meglio
            try {
                Thread.sleep(5000); //tempo in millisecondi
            } catch (InterruptedException e) {
            }
        }


        if ( t1.getVita() <= 0) return t1;
        else return t2;
    }
}
