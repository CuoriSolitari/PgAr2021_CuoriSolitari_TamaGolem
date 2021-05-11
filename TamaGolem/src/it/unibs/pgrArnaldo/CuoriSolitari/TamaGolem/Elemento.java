package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public enum Elemento {


    ACQUA("Acqua", 1),
    ARIA("Aria", 2);

    private String nome;
    private int id;

    private Elemento(String _nome, Integer _id){
        this.nome = _nome;
        this.id = _id;
    }

    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
}
