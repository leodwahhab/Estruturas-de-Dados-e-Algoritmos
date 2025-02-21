package listas.lista_ligada_dupla;

public class ListaDupla <T> {
    private NoDuplo <T> primeiro;
    private NoDuplo <T> ultimo;

    public ListaDupla() {

    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void inserirInicio(T info) {
        NoDuplo<T> novo = new NoDuplo<T>(info);
        if(!estaVazia()) {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        else{
            ultimo = novo;
        }
        primeiro = novo;
    }

    public void inserirFim(T info) {
        NoDuplo<T> novo = new NoDuplo<T>(info);
        if(!estaVazia()) {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        else {
            ultimo = novo;
        }
        primeiro = novo;
    }
}