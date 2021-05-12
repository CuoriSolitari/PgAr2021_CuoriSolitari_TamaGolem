package it.unibs.pgrArnaldo.CuoriSolitari.TamaGolem;

public class TamaGolem {

    private String nome;
    private int vita;

    public TamaGolem(String nome, int vita) {
        this.nome = nome;
        this.vita = vita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }
}
