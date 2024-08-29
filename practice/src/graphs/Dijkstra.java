import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    public int[] implementDijkstra(int srcNode){
        Graph g=new Graph();
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> graph=g.getGraph(sc);
        int ans[]=new int[g.getNodeLength()];
        Arrays.fill(ans, Integer.MAX_VALUE);
        PriorityQueue<Node> minPriorityQueue=new PriorityQueue<>();
        minPriorityQueue.add(new Node(srcNode, 0));
        while(!minPriorityQueue.isEmpty()){
            Node rem=minPriorityQueue.remove();
            if(ans[rem.vertex]!=Integer.MAX_VALUE) {
                continue;
            }
            else ans[rem.vertex]=rem.weight;
            List<Integer> nbr=graph.get(rem.vertex);
            for(int value: nbr){
                if(ans[value]!=Integer.MAX_VALUE)continue;
                minPriorityQueue.add(new Node(rem.vertex, rem.weight+value ));// it should be value.weight because the graph should be of type Pair class. As the nodes contain connections as well as weight.
            }
        }
        return ans;
    }
}
