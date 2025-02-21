package listas.lista_ligada_simples;


public class Teste1 {

    public static void main (String[] args){

        int n = 5;

        NossoVetor v1 =  new NossoVetor(n);

        System.out.println("nosso vetor depois do construtor "  + v1.getUltPos());

        System.out.println("nosso vetor v1: "  + v1);

        // NossoVetor v2 = new NossoVetor(n);

        // v1.setUltPos(10);

        System.out.println("ultima posicao depois do set: " + v1.getUltPos());

        // v1.getDados()[v1.getUltPos()] = 23;

        System.out.println("nosso vetor depois do set: "  + v1);

        //    if(){

        //         System.out.println("elemento inserido com successo");

        //    }

        //    else{

        //         System.out.println("vetor cheio");

        //    }

        System.out.println("nosso vetor depois do adiciona: " + v1);

    }

}
