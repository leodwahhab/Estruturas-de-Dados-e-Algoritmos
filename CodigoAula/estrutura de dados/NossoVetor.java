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

    public boolean estaCheio () {
        return ultPos == dados.length-1;
    }

    public boolean estaVazio (){
        return ultPos == -1;
    }

    private void redimensiona (int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i=0; i<=ultPos; i++) 
            temp[i] = dados[i];
        dados = temp;
    }

    public void adiciona (int e) {
        if (estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    } 

    public void adiciona (double e) {
        if (estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    } 

    public double remove () {
        if (estaVazio()) return -1;
        double aux = dados[ultPos--];
        if (dados.length >= 10 && ultPos <= dados.length/4) 
            redimensiona(dados.length / 2);
        return aux;
    }

    //método para inserir valores randômicos no vetor
    public void preencheVetor () {
        Random r = new Random();
        for (int i=0; i<dados.length; i++) {
            adiciona(r.nextInt(dados.length*10) + 1);
        }
    }

    public void esvaziaVetor() {
        ultPos = -1;
    }

    public void selectionSort() {
        for(int i=0; i < dados.length-1 ; i++){
            int min = i;

            for(int j = i+1; j < dados.length; j++){
                if(dados[j] < dados[min]){
                    min = j;
                }
            }
            double temp = dados[min];
            dados[min] = dados[i];
            dados[i] = temp;
        }
    }

    public void bubbleSort() {
        for(int i = 0; i < dados.length; i++) {
            for(int j = i+1; j < dados.length; j++) {
                if(dados[i] > dados[j]){
                    double aux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = aux;
                }
            }
        }
    }

    public void insertionSort() { 
        for (int j = 1; j < dados.length; j++) {  
            double temp = dados[j];  
            int i = j-1;  
            while ( (i > -1) && ( dados[i] > temp ) ) {  
                dados [i+1] = dados[i];  
                i--;  
            }  
            dados[i+1] = temp;  
        }  
    }  

    // public void quickSort() {
    //     quickSort(0, dados.length-1);
    // }

    void quickSort(int posInicio, int posFim) {
        if (posInicio < posFim) {
            int pivo = partition(posInicio, posFim);
            quickSort(posInicio, pivo - 1);
            quickSort(pivo + 1, posFim);
        }
    }

    int partition(int posInicio, int posFim) {
        double pivo = dados[posFim];
        int i = (posInicio - 1);

        for (int j = posInicio; j < posFim; j++) {
            if (dados[j] < pivo) {
                i++;

                double temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }

        double temp = dados[i + 1];
        dados[i + 1] = dados[posFim];
        dados[posFim] = temp;

        return i + 1;
    }
}