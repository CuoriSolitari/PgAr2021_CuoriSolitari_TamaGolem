package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class Costanti {

    //COSTANTI INTERE:

    public final static int NUM_TAMAGOLEM = 3;
    public final static int NUM_PIETRE = 3;
    public static final int HP = 15; //la vita iniziale del tamagolem

    //STRINGHE:

    public final static String BENVENUTO = "Benvenuti!!!\nSe siete qui è perchè non avete paura di far combattere clandestinamente i vostri Tamagolem, la regola è solo una: NON FATEVI BECCARE\nMa ora passiamo alle cose serie...\n";
    public final static String MSG_REGOLAMENTO = "Siete nuovi qui? Volete che vi spieghi il regolamento?\n1- SI\n2- NO";
    public final static String REGOLE = "\nScegliete la sezione del regolamento che volete approfondire:\n1- it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib.Equilibrio del mondo\n2- Evocazione del tamagolem\n3- Scontro\n4- Esci";
    public final static String REGOLE_EQUILIBRIO = "\nAll’inizio di ogni nuova partita l’Universo stabilisce casualmente le regole che governano le interazioni fra le forze naturali.\nL’insieme di queste interazioni è detto it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib.Equilibrio del Mondo.\nL’it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib.Equilibrio è fondamentale per definire l’esito degli scontri durante la fase di combattimento.";
    public final static String REGOLE_TAMAGOLEM = "\nOgni giocatore ha a disposizione %d TamaGolem, che può evocare nel corso dello Scontro.\nOgni TamaGolem può ingurgitare fino a %d pietre degli elementi\nDurante la fase di evocazione, il giocatore attivo seleziona un set di pietre fra quelle disponibili.";
    public final static String REGOLE_TAMAGOLEM2 = "Questo set verrà quindi assegnato al TamaGolem e non potrà più essere modificato\nPuò scendere in campo solo un TamaGolem per giocatore alla volta. I due TamaGolem in campo si sfideranno scagliando uno contro l’altro pietre degli elementi.";
    public final static String REGOLE_SCONTRO = "\nDue pietre scagliate l’una contro l’altra scatenano il potere dei relativi elementi, che interagiscono secondo l’it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib.Equilibrio generato all'inizio della partita.\nL’elemento debole causa dei danni al TamaGolem che l’ha scagliato.\nQuando un TamaGolem subisce un certo numero massimo di danni, denominato Vita del TamaGolem, viene eliminato dallo scontro. Il rispettivo giocatore deve quindi evocarne un altro.\nChi perde tutti i suoi TamaGolem è considerato sconfitto. L’altro giocatore è il vincitore.";
    public final static String MSG_START = "\nVa bene, ora sbrighiamoci prima che arrivino gli anziani dell'Accademia...\n";
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