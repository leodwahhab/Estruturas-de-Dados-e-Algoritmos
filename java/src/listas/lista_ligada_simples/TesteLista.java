package listas.lista_ligada_simples;

public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);

        for(int i = 1; i < 10; i++) {
            lista.inserirInicio(i*10);
            System.out.println(lista);
        }

        for(int i = 1; i < 10; i++) {
            lista.inserirFim(i*5);
            System.out.println(lista);
        }

        if(lista.estaVazia()) {
            System.out.println("lista vazia, nao ha o que remover");
        }
        else {
            System.out.println(lista.removerFim() + " foi removido do fim");
        }
    }
}