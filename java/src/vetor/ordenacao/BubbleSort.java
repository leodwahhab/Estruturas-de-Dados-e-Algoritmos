package vetor.ordenacao;

public class BubbleSort {
    public double[] dados = new double[10];

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

}
