package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class Costanti {

    //COSTANTI INTERE:

    public final static int NUM_TAMAGOLEM = 3;
    public final static int NUM_PIETRE = 3;
    public static final int HP = 15; //la vita iniziale del tamagolem

    //STRINGHE:

    public final static String BENVENUTO = "Benvenuti!!!\nSe siete qui è perchè non avete paura di far combattere clandestinamente i vostri Tamagolem, la regola è solo una: NON FATEVI BECCARE\nMa ora passiamo alle cose serie...\n";
    public final static String NOME_GIOCATORE = "Inserisci il tuo nome giocatore ";
    public final static String NOME_TAMAGOLEM = "Inserisci il nome del tuo TamaGolem: ";
    public final static String CREA_TAMAGOLEM = "\n%s iscrivi i tuoi TamaGolem: ";
    public final static String START_GAME = "\nInizia la partita...\n";
    public final static String TURNO = "È il turno di %s:";
    public final static String SCELTA = "\nEcco le pietre che il tuo TamaGolem può ingurgitare:";
    public final static String PERDITA_TAMAGOLEM = "%s il tuo TamaGolem %s è esausto\n";

    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E){
            System.out.println(E);
        }
    }
}