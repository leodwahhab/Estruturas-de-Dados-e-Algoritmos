package vetor.ordenacao;

public class InsertionSort {
    public double[] dados = new double[10];

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


}
