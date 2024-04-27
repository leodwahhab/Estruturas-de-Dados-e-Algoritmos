public class Lista {
    private No primeiro;
    
    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return primeiro == null; //se primeiro for igual a null, retorna vdd, senao false
    }

    public void insereInicio(int i) {
        No novo = new No(i);
        if(!estaVazia()) {
            novo.setProximo(primeiro);
        }
        this.primeiro = novo;
    }

    @Override
    public String toString() {
        String s = "lista: ";

        if(estaVazia()) {
            s += estaVazia();
        }
        else {
            No aux = primeiro;
            while(aux != null) { //percorre ate o final da lista
                s += aux;
                aux = aux.getProximo();
            }
            s += "\\\\";
        }

        return s + "\n";
    }

    public void insereFim(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            primeiro = novo;
        }
        else {
            No aux = primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio() {
        int info = primeiro.getInfo();

        primeiro = primeiro.getProximo();

        return info;
    }

    public int removeFim() {
        int temp;

        if(primeiro.getProximo() == null) { //testa se so tem um elemento
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else {
            No aux = primeiro;
            while(aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return temp;
    }
}