public class ListaComUltimo extends Lista{
    private No ultimo;

    @Override
    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        if(super.estaVazio()) {
            ultimo = novo;
        }
        else{
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    }

    @Override
    public void adicionarFim(int valor) {
        No novo = new No(valor);
        if(estaVazio()) {
            super.setPrimeiro(novo);
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    @Override
    public void removerInicio() {
        if(!super.estaVazio()) {
            super.setPrimeiro(null);
        }
    }

    @Override
    public void removerFim() {
        if(!super.estaVazio()) {
            if(super.getPrimeiro().getProximo() == null) {
                super.setPrimeiro(null);
            }
            else{
                ultimo = null;
            }
        }
    }
}