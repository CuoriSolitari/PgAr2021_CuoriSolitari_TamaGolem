package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.src.it.unibs.fp.mylib.InputDati;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println(Costanti.BENVENUTO);

        //Chiede di inserire il nome ai giocatori
        String g1 = InputDati.leggiStringaNonVuota(Costanti.NOME_GIOCATORE + "1: ");
        String g2 = InputDati.leggiStringaNonVuota(Costanti.NOME_GIOCATORE + "2: ");

        ArrayList<TamaGolem> tama_golems1 = new ArrayList<>();
        ArrayList<TamaGolem> tama_golems2 = new ArrayList<>();

        //Creazione della squadra del giocatore 1:
        System.out.println(String.format(Costanti.CREA_TAMAGOLEM, g1));
        for(int i=0; i<Costanti.NUM_TAMAGOLEM; i++){
            String nome = InputDati.leggiStringaNonVuota(Costanti.NOME_TAMAGOLEM);
            TamaGolem tama = new TamaGolem(nome, Costanti.HP, null);
            tama_golems1.add(tama);
        }
        Squadra squadra_1 = new Squadra(g1, tama_golems1);

        //Creazione della squadra del giocatore 2:
        System.out.println(String.format(Costanti.CREA_TAMAGOLEM, g2));
        for(int i=0; i<Costanti.NUM_TAMAGOLEM; i++){
            String nome = InputDati.leggiStringaNonVuota(Costanti.NOME_TAMAGOLEM);
            TamaGolem tama = new TamaGolem(nome, Costanti.HP, null);
            tama_golems2.add(tama);
        }
        Squadra squadra_2 = new Squadra(g1, tama_golems1);

        for(int fase=0; fase<3; fase++){

            if(fase == 1){
                Equilibrio.creaEquilibrio();
            }

            else if(fase == 2) {
                System.out.println(Costanti.START_GAME);

                while(tama_golems1.size() != 0 && tama_golems2.size() != 0) {
                    ArrayList<Pietra> pietre_g1 = new ArrayList<>();
                    ArrayList<Pietra> pietre_g2 = new ArrayList<>();

                    //GIOCATORE 1; attribuisce al suo tamagolem gli elementi
                    System.out.println(String.format(Costanti.TURNO, g1) + Costanti.SCELTA);
                    //Stampa le pietre che il golem può ingurgitare
                    int k = 0;
                    for (Elemento e : Equilibrio.getElementi()) {
                        k++;
                        System.out.println(k + "- " + e);
                    }
                    for (int i = 0; i < Costanti.NUM_PIETRE; i++) {
                        Elemento elemento = null;
                        int comando = InputDati.leggiIntero(String.format("Scegli la pietra numero %d: ", i + 1), 1, Equilibrio.getElementi().length);
                        if (comando == 1) {
                            elemento = Elemento.ACQUA;
                        } else if (comando == 2) {
                            elemento = Elemento.ARIA;
                        } else if (comando == 3) {
                            elemento = Elemento.FUOCO;
                        }

                        Pietra pietra = new Pietra(elemento);
                        pietre_g1.add(pietra);
                    }
                    tama_golems1.get(0).setPietre(pietre_g1);

                    //Nasconde le mosse al giocatore successivo
                    for (int i = 0; i < 20; i++)
                        System.out.println("\n");
                    Costanti.cls();

                    //GIOCATORE 2; attribuisce al suo tamagolem gli elementi
                    System.out.println(String.format(Costanti.TURNO, g2) + Costanti.SCELTA);
                    //Stampa le pietre che il golem può ingurgitare
                    k = 0;
                    for (Elemento e : Equilibrio.getElementi()) {
                        k++;
                        System.out.println(k + "- " + e);
                    }
                    for (int i = 0; i < Costanti.NUM_PIETRE; i++) {
                        Elemento elemento = null;
                        int comando = InputDati.leggiIntero(String.format("Scegli la pietra numero %d: ", i + 1), 1, Equilibrio.getElementi().length);
                        if (comando == 1) {
                            elemento = Elemento.ACQUA;
                        } else if (comando == 2) {
                            elemento = Elemento.ARIA;
                        } else if (comando == 3) {
                            elemento = Elemento.FUOCO;
                        }

                        Pietra pietra = new Pietra(elemento);
                        pietre_g2.add(pietra);
                    }
                    tama_golems1.get(0).setPietre(pietre_g2);

                    //Gioca la battaglia tra i due tamagolem ed elimina dall'array di tamagolem di uno dei due il tamagolem easusto
                    TamaGolem esausto = Battaglia.combattimento(tama_golems1.get(0), tama_golems2.get(0));
                    if(esausto.equals(tama_golems1.get(0))){
                        tama_golems1.remove(0);
                        System.out.println(String.format(Costanti.PERDITA_TAMAGOLEM, g1, tama_golems1.get(0).getNome()));
                    }
                    else if(esausto.equals(tama_golems2.get(0))){
                        tama_golems2.remove(0);
                        System.out.println(String.format(Costanti.PERDITA_TAMAGOLEM, g2, tama_golems2.get(0).getNome()));
                    }
                }
            }

            else if(fase == 3){

            }

        }
    }
}
