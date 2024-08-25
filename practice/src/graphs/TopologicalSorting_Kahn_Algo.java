import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TopologicalSorting_Kahn_Algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph input=new Graph();
        List<List<Integer>>graph=input.getGraph(sc);
        int nodeLength=input.getNodeLength();
        TopologicalSorting_Kahn_Algo topoSort=new TopologicalSorting_Kahn_Algo();
        topoSort.sortTopologically(graph,nodeLength);
    }
    public void sortTopologically(List<List<Integer>> graph,int nodeLength){
        int []indegree=new int[nodeLength];
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0 ; i<nodeLength ; i++)
        {
            List<Integer> connections=graph.get(i);
            for(int nbr:connections){
                indegree[nbr]++;
            }
        }
        for(int i=0 ; i<nodeLength ; i++)
        {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int rem=q.remove();
            List<Integer> nbr=graph.get(rem);
            for(int v:nbr){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
            System.out.print(rem+" ");
        }
    }
}
