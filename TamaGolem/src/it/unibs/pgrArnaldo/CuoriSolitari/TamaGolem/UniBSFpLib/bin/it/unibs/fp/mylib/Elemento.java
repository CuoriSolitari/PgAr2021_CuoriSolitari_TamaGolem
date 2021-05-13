package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem.UniBSFpLib.bin.it.unibs.fp.mylib;

public enum Elemento {


    ACQUA("Acqua", 1),
    ARIA("Aria", 2),
    FUOCO("Fuoco", 3);

    private String nome;
    private int id;

    private Elemento(String _nome, Integer _id){
        this.nome = _nome;
        this.id = _id;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
}
