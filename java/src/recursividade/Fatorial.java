package recursividade;

class Fatorial {
    static int fatorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * fatorial(n-1);
    }

    static int fibonacci(int n) {
        if(n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void exibeRec1(int i, int n) {
        if(i <= n) {
            System.out.println(i);
            exibeRec1(i+1, n);
        }
    }

    static void exibeRec2(int n) {
        if(n > 1) {
            exibeRec2(n - 1);
            System.out.println(n);
        }
    }

    static int somaRec1(int[] v, int i) {
        if(i < v.length) {
            return v[i] + somaRec1(v, i+1);
        }
        return 0;
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++) {
            System.out.println("fatorial de " + i + " = " + fibonacci(i));
            // System.out.println("fatorial de " + i + " = " + String.format("%.0f", fatorial(i)));
        }

        for(int i = 0; i < 10; i++) {

        }
    }
}
