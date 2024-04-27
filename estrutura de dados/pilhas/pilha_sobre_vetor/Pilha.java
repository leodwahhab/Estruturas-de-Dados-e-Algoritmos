public class Pilha {
    private int[] dados;
    private int topo;
    private static final int CAPACIDADE_MINIMA = 10;

    public Pilha(int capacidade) {
        this.dados = new int[capacidade];
        topo = capacidade - 1;
    }

    public Pilha() {
        this(CAPACIDADE_MINIMA);
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == dados.length-1;
    }

    public boolean empilhar() {
        if(!estaCheia()) {

        }

        return true;
    }

    public boolean desempilhar() {
        
    }
}