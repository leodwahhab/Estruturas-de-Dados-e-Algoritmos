package listas.lista_ligada_dupla;

public class NoDuplo <T> {
    private T info;
    private NoDuplo<T> proximo;
    private NoDuplo<T> anterior;

    public NoDuplo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> ultimo) {
        this.anterior = ultimo;
    }

    @Override
    public String toString() {
        return "" + info;
    }
}
