package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import java.util.ArrayDeque;
import java.util.ArrayList;
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
    public static TamaGolem combattimento(TamaGolem t1, TamaGolem t2, int[][] mat){

        int turno = 0;
        while(t1.getVita() > 0 && t2.getVita() >0) {

            if (mat[t1.getPietre().get(0).getElemento().getId() - 1][t2.getPietre().get(0).getElemento().getId() - 1] > 0)
                t2.setVita(t2.getVita() - mat[t1.getPietre().get(0).getElemento().getId() - 1][t2.getPietre().get(0).getElemento().getId() - 1]);
            else
                t1.setVita(t1.getVita() + mat[t1.getPietre().get(0).getElemento().getId() - 1][t2.getPietre().get(0).getElemento().getId() - 1]);

            t1.getPietre().add(t1.getPietre().get(0));
            t1.getPietre().remove(0);
            t2.getPietre().add(t1.getPietre().get(0));
            t2.getPietre().remove(0);
        }
        if ( t1.getVita() <= 0) return t1;
        else return t2;
    }
}
