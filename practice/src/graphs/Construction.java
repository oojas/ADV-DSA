import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Construction {
    public int[][] getConn(Scanner sc, int n) {
        System.out.println("Enter your connections");
        int [][] conn=new int[n][2];
        for(int i=0 ; i<n ; i++)
        {
            conn[i][0]=sc.nextInt();
            conn[i][1]=sc.nextInt();
        }
        System.out.println("Connections look like : ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.println(conn[i][0]+" "+conn[i][1]);
        }
        return conn;
    }

    public List<List<Integer>> constructGraph(int n,int [][]conn) {
        System.out.println("Making the graph");
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0 ; i<n ; i++)
        {
            int u=conn[i][0];
            int v=conn[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        print(graph);
        return graph;
    }
    private void print(List<List<Integer>> graph){
        System.out.println("Graph looks like");
        for(int i=0 ; i<graph.size() ; i++)
        {
            System.out.print(graph.get(i)+" ");
        }
    }
}
