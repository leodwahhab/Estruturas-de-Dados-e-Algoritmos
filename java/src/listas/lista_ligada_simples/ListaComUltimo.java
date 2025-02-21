package listas.lista_ligada_simples;


public class ListaComUltimo extends Lista{
    public No ultimo;

    @Override
    public void inserirInicio(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    }

    @Override
    public void inserirFim(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            super.setPrimeiro(novo);
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    @Override
    public int removerInicio() {
        int temp = super.getPrimeiro().getInfo();
        super.setPrimeiro(super.getPrimeiro().getProximo());
        if(estaVazia())
            ultimo = null;
        return temp;
    }
}
