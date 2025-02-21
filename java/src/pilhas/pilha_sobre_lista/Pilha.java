package pilhas.pilha_sobre_lista;

public class Pilha {
    private No topo;

    public void empilha(int i) {
        No novo = new No(i);
        if(!estaVazia()) {
            novo.setProximo(novo);
        }
        topo = novo;
    }

    public int desempilha() {
        int info = topo.getInfo();
        topo = topo.getProximo();
        return info;
    }

    public int consultaTopo() {
        return topo.getInfo();
    }

    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public String toString() {
        String s = "";

        if(estaVazia()) {
            s += "esta vazia";
        }
        else {
            No aux = topo;
            while(aux != null) {
                s += aux + "\n";
                aux = aux.getProximo();
            }
        }
        return s;
    }
}

class No {
    private int info;
    private No proximo;

    public No(int info) {
        setInfo(info);
        setProximo(null);
    }

    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "|" + info + "|";
    }
}
