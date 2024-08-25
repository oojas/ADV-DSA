import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    private static void initialize() {
        Construction cons=new Construction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int nodes=sc.nextInt();
        System.out.println("Enter the number of connections : ");
        int con=sc.nextInt();
        int [][]conn=cons.getConn(sc, con);
        List<List<Integer>> graph=cons.constructGraph(nodes, conn);
        System.out.println("Enter the root node");
        int root=sc.nextInt();
        BFS bfs=new BFS();
        bfs.printBFS(graph,nodes,root);
    }
    public void printBFS(List<List<Integer>> graph,int nodes, int root){
        if(graph.isEmpty())throw new IllegalArgumentException();

        //Creating a queue.
        Queue<Integer> q=new ArrayDeque<>();
        boolean []visited=new boolean[nodes];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int rem=q.remove();
            int i=0;
            while(i<graph.get(rem).size()){
                int val=graph.get(rem).get(i);
                if(!visited[val]){
                    q.add(val);
                    visited[val]=true;
                }
                i++;
            }
            System.out.print(rem+", ");
        }
    }
}
