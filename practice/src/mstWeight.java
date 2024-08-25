
import java.util.Arrays;

public class mstWeight {
    public static void main(String[] args) {
        int nodes=9;
        int [][]a=new int[6][3];
        mstWeight mst=new mstWeight();
        mst.findMST(nodes,a);
    }
    void findMST(int n,int [][]a){
        Arrays.sort(a,(b,c)->Integer.compare(c[2], b[2]));
        int pair[]=new int[n];
        int rank[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            pair[i]=i;
            rank[i]=1;
        }
        for (int[] a1 : a) {
            int u = a1[0];
            int v = a1[1];
            int wt = a1[2];
            boolean isMerge=union(u,v,pair,rank);
        }
    }
    public boolean union(int u,int v,int []pair,int []rank){
        return false;
    }
}
