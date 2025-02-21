package pilhas.pilha_sobre_vetor;

public class Pilha {
    private int[] dados;
    private int topo;

    public static final int CAPACIDADE_Minima = 10;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }
    public Pilha() {
        this(CAPACIDADE_Minima);
    }
    public boolean estaVazia(){
        return topo == -1;
    }
    public boolean estaCheia(){
        return topo == dados.length-1;
    }
    public boolean empilha (int value){
        if(estaCheia()){
            return false;
        }
        topo++;
        dados[topo]= value;
        return true;
    }
    public int desempilha (){
        if(estaVazia())return -1; // if e else funcionam sem chaves se forem feitos em uma linha
        int temp = dados[topo];
        topo--;
        return dados[temp];
    }
    int tamanho(){
        return topo+1;
    }
    @Override
    public String toString(){
        if(estaVazia()) return"Pilha vazia";
        String s = "";
        for(int i = topo; i >= 0; i--){
            s += dados[i] + "\n";
        }
        s += "_ _ _ _ _ _ _ _ _";
        return s;
    }
}
