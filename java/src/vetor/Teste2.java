package vetor;

public class Teste2{
    public static void main(String[] args){
        NossoVetor v = new NossoVetor(10);
        int i = 10;
        while(!v.estaCheio()){
            v.adicionar(i);
            i += 10;
            System.out.println(v);
        }
        while(!v.estaVazio()){
            System.out.println(v.remover()+ " foi atendido \n");
            System.out.println(v);
        }
    }
}

