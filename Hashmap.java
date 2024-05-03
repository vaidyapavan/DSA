import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is DFS code");

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("5", Arrays.asList("3", "7"));
        graph.put("3", Arrays.asList("2", "4"));
        graph.put("7", Arrays.asList("8"));
        graph.put("2", Collections.emptyList());
        graph.put("4", Arrays.asList("8"));
        graph.put("8", Collections.emptyList());

        Set<String> visited = new HashSet<>();
        System.out.println("\nDepth-First Search:");
        dfs(visited, graph, "5");
    }

    public static void dfs(Set<String> visited, Map<String, List<String>> graph, String node) {
        if (!visited.contains(node)) {
            System.out.println(node);
            visited.add(node);
            for (String neighbour : graph.get(node)) {
                dfs(visited, graph, neighbour);
            }
        }
    }
}
