public class Teste3 {
    public static void main(String[] args){
      NossoVetor v = new NossoVetor(5);
      for (int i=1; i <= 100; i++){
        v.adicionar(i);
        System.out.println("inseriu " + i +" capacidade = " + v.getDados().length);
      }
      while(!v.estaVazio()){
        System.out.println(v.remover()+ " foi atendido, nova capacidade = " + v.getDados().length);
        System.out.println(v);
      }
    }
  }