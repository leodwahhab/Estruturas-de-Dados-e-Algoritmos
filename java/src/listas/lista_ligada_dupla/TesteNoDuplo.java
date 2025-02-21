package listas.lista_ligada_dupla;

public class TesteNoDuplo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Feliz da Silva", 2000);
        NoDuplo<Pessoa> no1 = new NoDuplo<>(p);
        System.out.println(no1);

        Carro c = new Carro("lalalalala", 2005);
        NoDuplo<Carro> no2 = new NoDuplo<>(c);
        System.out.println(no2);

        NoDuplo<Pessoa> no3 = new NoDuplo<>(new Pessoa("leonardo", 2005));
        System.out.println(no3);
    }
}