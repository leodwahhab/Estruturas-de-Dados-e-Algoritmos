package vetor;

import java.util.Random;

public class NossoVetor {
    private int ultPos;
    public double[] dados;

    public NossoVetor (int capacidade) {
        ultPos = -1;
        dados = new double[capacidade];
    }

    //métodos de acesso
    public int getUltPos() {
        return ultPos;
    }

    public double[] getDados() {
        return dados;
    }

    @Override
    public String toString() {
        String s="";
        if (estaVazio())
            s = s + "vetor vazio";
        else
            for (int i=0; i<=ultPos; i++)
                s = s + String.format("%.0f ", dados[i]);
        return s /* + "\n" */ ;
    }

    public boolean estaCheio() {
        return ultPos == dados.length-1;
    }

    public boolean estaVazio(){
        return ultPos == -1;
    }

    private void redimensionar(int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i=0; i<=ultPos; i++)
            temp[i] = dados[i];
        dados = temp;
    }

    public void adicionar(int e) {
        if (estaCheio()) redimensionar(dados.length * 2);
        dados[++ultPos] = e;
    }

    public void adicionar(double e) {
        if (estaCheio()) redimensionar(dados.length * 2);
        dados[++ultPos] = e;
    }

    public double remover() {
        if (estaVazio()) return -1;
        double aux = dados[ultPos--];
        if (dados.length >= 10 && ultPos <= dados.length/4)
            redimensionar(dados.length / 2);
        return aux;
    }

    //método para inserir valores randômicos no vetor
    public void preencheVetor() {
        Random r = new Random();
        for (int i=0; i<dados.length; i++) {
            adicionar(r.nextInt(dados.length*10) + 1);
        }
    }

    public void esvaziarVetor() {
        ultPos = -1;
    }
}
