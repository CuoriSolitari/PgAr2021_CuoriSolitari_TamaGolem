package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

import it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.src.it.unibs.fp.mylib.InputDati;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println(Costanti.BENVENUTO);

        //Nell'eventualità che la persona non conosca le regole può farsele spiegare
        System.out.println(Costanti.MSG_REGOLAMENTO);
        int comando = InputDati.leggiIntero("Comando: ", 1, 2);
        if(comando == 1){
            do{
                System.out.println(Costanti.REGOLE);
                comando = InputDati.leggiIntero("Comando: ", 1, 4);
                //Regolamento sull'equilibrio
                if(comando == 1){
                    System.out.println(Costanti.REGOLE_EQUILIBRIO);
                }
                //Regolamento sui Tamagolem
                else if(comando == 2){
                    System.out.println(String.format(Costanti.REGOLE_TAMAGOLEM, Costanti.NUM_TAMAGOLEM, Costanti.NUM_PIETRE));
                    System.out.println(Costanti.REGOLE_TAMAGOLEM2);
                }
                //Regolamento sullo scontro
                else if(comando == 3){
                    System.out.println(Costanti.REGOLE_SCONTRO);
                }

            } while (comando != 4);
        }

        System.out.println(Costanti.MSG_START);
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

        int[][] mat_eq = null;

        do {
            for (int fase = 1; fase <= 3; fase++) {

                if (fase == 1) {
                    mat_eq = Equilibrio.creaEquilibrio();
                } else if (fase == 2) {
                    System.out.println(Costanti.START_GAME);

                    while (tama_golems1.size() != 0 && tama_golems2.size() != 0) {
                        ArrayList<Pietra> pietre_g1 = new ArrayList<>(0);
                        ArrayList<Pietra> pietre_g2 = new ArrayList<>(0);

                        if (tama_golems1.get(0).getPietre() == null) {
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
                                comando = InputDati.leggiIntero(String.format("Scegli la pietra numero %d: ", i + 1), 1, Equilibrio.getElementi().length);
                                if (comando == 1) {
                                    elemento = Elemento.ALTAIR;
                                } else if (comando == 2) {
                                    elemento = Elemento.EZIO;
                                } else if (comando == 4) {
                                    elemento = Elemento.EDWARD;
                                } else if (comando == 3) {
                                    elemento = Elemento.CONNOR;
                                } else if (comando == 5) {
                                    elemento = Elemento.SHAY;
                                }

                                Pietra pietra = new Pietra(elemento);
                                pietre_g1.add(pietra);
                            }
                            tama_golems1.get(0).setPietre(pietre_g1);
                            System.out.println("\n");
                        }

                        //Nasconde le mosse al giocatore successivo
                        for (int i = 0; i < 20; i++)
                            System.out.println("\n");

                        if (tama_golems2.get(0).getPietre() == null) {
                            //GIOCATORE 2; attribuisce al suo tamagolem gli elementi
                            System.out.println(String.format(Costanti.TURNO, g2) + Costanti.SCELTA);
                            //Stampa le pietre che il golem può ingurgitare
                            int k = 0;
                            for (Elemento e : Equilibrio.getElementi()) {
                                k++;
                                System.out.println(k + "- " + e);
                            }
                            for (int i = 0; i < Costanti.NUM_PIETRE; i++) {
                                Elemento elemento = null;
                                comando = InputDati.leggiIntero(String.format("Scegli la pietra numero %d: ", i + 1), 1, Equilibrio.getElementi().length);
                                if (comando == 1) {
                                    elemento = Elemento.ALTAIR;
                                } else if (comando == 2) {
                                    elemento = Elemento.EZIO;
                                } else if (comando == 4) {
                                    elemento = Elemento.EDWARD;
                                } else if (comando == 3) {
                                    elemento = Elemento.CONNOR;
                                } else if (comando == 5) {
                                    elemento = Elemento.SHAY;
                                }

                                Pietra pietra = new Pietra(elemento);
                                pietre_g2.add(pietra);
                            }
                            tama_golems2.get(0).setPietre(pietre_g2);
                            System.out.println("\n");
                        }

                        //Gioca la battaglia tra i due tamagolem ed elimina dall'array di tamagolem di uno dei due il tamagolem easusto
                        TamaGolem esausto = Battaglia.combattimento(tama_golems1.get(0), tama_golems2.get(0), mat_eq);
                        if (esausto.equals(tama_golems1.get(0))) {
                            System.out.println(String.format(Costanti.PERDITA_TAMAGOLEM, g1, tama_golems1.get(0).getNome()));
                            tama_golems1.remove(0);
                        } else if (esausto.equals(tama_golems2.get(0))) {
                            System.out.println(String.format(Costanti.PERDITA_TAMAGOLEM, g2, tama_golems2.get(0).getNome()));
                            tama_golems2.remove(0);
                        }

                        //ritrda l'esecuzione di 5 secondi per visualizzare tutto meglio
                        try {
                            Thread.sleep(5000); //tempo in millisecondi
                        } catch (InterruptedException e) {
                        }
                    }
                } else if (fase == 3) {

                    //Stampa il vincitore cioè quello che ha l'array di tamagolem non vuoto
                    if (tama_golems1.size() == 0) {
                        System.out.println(String.format(Costanti.VITTORIA, g2));
                    } else {
                        System.out.println(String.format(Costanti.VITTORIA, g1));
                    }

                    //Stampa l'Equilibrio tra gli elementi
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (mat_eq[i][j] > 0) {
                                System.out.println(String.format(Costanti.FORTE, Equilibrio.getElementi()[i].getNome(), mat_eq[i][j], Equilibrio.getElementi()[j].getNome()));
                            }
                        }
                    }
                }
            }

            System.out.println("Volete giocare ancora?\n1- SI\n2- NO");
            comando = InputDati.leggiIntero("Comando: ", 1, 2);

            if(comando == 2){
                System.out.println(Costanti.ARRIVEDERCI);
            }
        } while (comando == 1);
    }
}
