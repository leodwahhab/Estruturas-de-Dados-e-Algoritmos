package grafos;

import java.util.*;

public class BuscaEmLargura {
    public static void main(String[] args) {
        Map<String, List<String>> grafo = new HashMap<>(Map.of(
                "eu", List.of("alice", "bob", "claire"),
                "bob", List.of("anuj", "peggy"),
                "alice", List.of("alice"),
                "claire", List.of("thom", "peggy"),
                "anuj", List.of(),
                "peggy", List.of(),
                "thom", List.of(),
                "jhonny", List.of())
        );
        Queue<String> visitar = new ArrayDeque<>(List.of("eu"));
        Set<String> visitados = new HashSet<>();

        while(true) {
            if(visitar.isEmpty()) {
                System.out.println("Não há vendedor de manga na sua rede de conexões!");
                break;
            }

            var vertice = visitar.poll();

            if(visitados.contains(vertice))
                continue;

            if(ehVendedorManga(vertice)) {
                System.out.println("vendedor encontrado: " + vertice);
                break;
            }

            var vizinhos = grafo.get(vertice);
            visitar.addAll(vizinhos);
            visitados.add(vertice);
        }
    }

    private static boolean ehVendedorManga(String nome) {
        return nome.startsWith("p");
    }
}
