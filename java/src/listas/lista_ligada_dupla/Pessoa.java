package listas.lista_ligada_dupla;

public class Pessoa {
    private String nome;
    private int anoNasc;

    public Pessoa(String nome, int anoNasc) {
        setNome(nome);
        setAnoNasc(anoNasc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        return "Pessoa: {nome: " + nome + ", anoNasc: " + anoNasc + "}";
    }
}