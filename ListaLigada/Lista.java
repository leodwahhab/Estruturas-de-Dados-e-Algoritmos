public class Lista {
    private No primeiro;

    public boolean estaVazio() {
        return primeiro == null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        if(!estaVazio()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public void adicionarFim(int valor) {
        if(estaVazio()){
            adicionarInicio(valor);
        }
        else{
            No novo = new No(valor);
            No temp = primeiro;
            while(temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }
    }

    public void removerInicio() {
        if(!estaVazio()) {
            primeiro = null;
        }
    }

    public void removerFim() {
        if(!estaVazio()) {
            if(primeiro.getProximo() == null) {
                removerInicio();
            }
            else{
                No temp = primeiro;
                while(temp.getProximo().getProximo() != null) {
                    temp = temp.getProximo();
                }
                temp.setProximo(null);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";

        No temp = primeiro;
        if(!estaVazio()) {
            while(temp.getProximo() != null) {
                s += "[" + temp.getValor() + "] => ";
                temp = temp.getProximo();
            }
        }
        return s += "[//]";
    }
}