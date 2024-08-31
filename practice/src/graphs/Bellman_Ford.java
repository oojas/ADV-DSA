public class Bellman_Ford {
    public static int[] runBellmanFord(Graph g, int[] ans, int[][] connections) {
        for(int i=0 ; i<g.getNodeLength()-1 ; i++)
        {
            for(int j=0 ; j<ans.length ; j++)
            {
                int node=connections[i][0];
                int conn= connections[i][1];
                int weight=connections[i][2];
                if(ans[conn]>weight+ans[node] && ans[node]!=Integer.MAX_VALUE){
                    ans[conn]=weight+ans[node];
                }
            }
        }
        return ans;
    }
}
