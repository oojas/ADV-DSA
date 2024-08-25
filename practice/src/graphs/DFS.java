import java.util.List;
import java.util.Scanner;
public class DFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph graph=new Graph();
        DFS dfs=new DFS();
        System.out.println("Enter the source node");
        int src=sc.nextInt();
        boolean []visited=new boolean[graph.getNodes(sc)];
        dfs.printDFS(graph.getGraph(sc),visited,src);
    }
    public void printDFS(List<List<Integer>> graph,boolean []visited,int src){
            List<Integer> nodes=graph.get(src);
            for(int i=0 ; i<nodes.size() ; i++)
            {
                int node=nodes.get(i);
                if(!visited[node]){
                    printDFS(graph, visited, node);
                    visited[node]=true;
                }
            }
    }
}
