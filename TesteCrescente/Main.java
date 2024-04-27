import java.util.Scanner;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a capacidade do vetor: ");
        int n = sc.nextInt();
        
        while(n > 0) {
            Vetor v = new Vetor(n);
            
            v.preencherVetor();
            System.out.println("vetor preenchido: " + v);

            double inicio = new Date().getTime();
            v.bubbleSort();
            double fim = new Date().getTime();

            System.out.println("vetor ordenado pelo bubble sort: " + v);
            System.out.println("bubble sort demorou " + String.format("%.1f", ((fim - inicio)/1000)) + "s para ser executado");
            
            System.out.print("digite a capacidade do vetor: ");
            n = sc.nextInt();
        }
    }
}