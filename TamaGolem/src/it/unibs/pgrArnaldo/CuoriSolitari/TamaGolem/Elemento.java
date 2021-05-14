package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public enum Elemento {


    ALTAIR("Pietra di Altair", 1),
    EZIO("Pietra di Ezio", 2),
    CONNOR("Pietra di Connor", 3),
    EDWARD("Pietra di Edward", 4),
    SHAY("Pietra di Shay", 5);

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
