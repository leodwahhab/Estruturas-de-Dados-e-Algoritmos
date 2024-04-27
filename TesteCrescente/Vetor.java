import java.util.Random;

public class Vetor {
    private double[] dados;
    private int ultPos;

    public Vetor(int capacidade) {
        dados = new double[capacidade];
        ultPos = -1;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i <= ultPos; i++) {
            s += String.format("%.0f", dados[i]) + " ";
        }
        return s + "\n";
    }

    public void preencherVetor() {
        Random r = new Random();
        for(int i = 0; i < dados.length; i++) {
            dados[i] = r.nextDouble(dados.length*10);
            ultPos++;
        }
    }

    public boolean estaCheio() {
        return ultPos == dados.length - 1;
    }

    public boolean estaVazio() {
        return ultPos == -1;
    }

    public void esvaziar() {
        ultPos = -1;
    }

    public void redimensionar(int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for(int i = 0; i < dados.length; i++) 
            temp[i] = dados[i];
        dados = temp;
    }

    public void adicionar(double v) {
        if(estaCheio()) redimensionar(dados.length*2);
        dados[++ultPos] = v;
    }

    public void remover() {
        if(!estaVazio()) {
            if(dados.length >= 10 && ultPos <= dados.length/4) {
                redimensionar(dados.length/2);
            }
            ultPos--;
        }
    }

    public void bubbleSort() {
        for(int i = 0; i < dados.length; i++) {
            for(int j = 0; j < dados.length-1; j++) {
                if(dados[j] > dados[j+1]) {
                    double temp = dados[j];
                    dados[j] = dados[j+1];
                    dados[j+1] = temp;
                }
            }
        }
    }
}