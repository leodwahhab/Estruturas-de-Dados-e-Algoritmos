package vetor.ordenacao;

public class SelectionSort {
    public double[] dados = new double[10];

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

}
