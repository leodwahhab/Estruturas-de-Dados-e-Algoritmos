import java.util.Scanner;
import java.util.Date;

public class Ordenacao{
    public static void main (String[]Args){
        Scanner sc = new Scanner(System.in);
        NossoVetor v;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();

        while ( n > 0){
            v = new NossoVetor(n);
            v.preencheVetor();

            System.out.println("vetor gerado: " + v);

            double inicio = new Date().getTime();
            v.quickSort(0, n-1);
            double fim = new Date().getTime();

            System.out.println("Vetor ordenado pelo bubble: " + v);
            System.out.println("n: " + n + ", Selection demorou " + ((fim - inicio) / 100) + " segundos");
            System.out.println("Digite o tamanho do vetor, 0 encerra");

            n = sc.nextInt();
        }

        sc.close();
    }
}