public class Program {
    public static void main(String[] args) {
        ListaComUltimo lista = new ListaComUltimo();

        for(int i = 1; i < 5; i++) {
            lista.adicionarFim(i*10);
            System.out.println(lista);
        }
        
        while(!lista.estaVazio()) {
            lista.removerInicio();
            System.out.println(lista);
        }
        
        for(int i = 1; i < 5; i++) {
            lista.adicionarInicio(i*10);
            System.out.println(lista);
        }
        
        // while(!lista.estaVazio()) {
        //     lista.removerFim();
        //     System.out.println(lista);
        // }
    }
}