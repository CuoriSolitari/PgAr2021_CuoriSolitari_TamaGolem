package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;


public class Battaglia {

    private boolean vincitore;
    private int fase;

    /**
     * Questo metodo si occupa di scorrere le varie fasi del gioco
     *
     */
    public void play(){


        for(fase=0; fase<3; fase++){

            if(fase == 1){
                Equilibrio.creaEquilibrio();
            }

            else if(fase == 2){



            }

            else if(fase == 3){

            }

        }
    }
}
