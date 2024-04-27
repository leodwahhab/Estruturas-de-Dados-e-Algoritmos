import java.util.Scanner;
import java.util.Date;

public class Ordenacao{
    public static void main (String[]Args){
        Scanner sc = new Scanner(System.in);
        NossoVetor v;

        System.out.println("Digite o tamanho do vetor, 0 encerra");
        int n = sc.nextInt();

        while ( n > 0){
            v = new NossoVetor(n);
            v.preencheVetor();

            System.out.println("vetor gerado: " + v);

            v.adiciona(10);

            System.out.println("vetor 10 adicionado: " + v);

            // long inicio = new Date().getTime();
            // v.quickSort(0, n-1);
            // long fim = new Date().getTime();

            // System.out.println("Vetor ordenado pelo quicksort: " + v);
            // System.out.println("n: " + n + ", Selection demorou " + (fim - inicio) + " milisegundos");
            System.out.println("Digite o tamanho do vetor, 0 encerra");

            n = sc.nextInt();
        }

        sc.close();
    }
}