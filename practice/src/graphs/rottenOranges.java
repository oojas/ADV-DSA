
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class rottenOranges {
    public static void main(String[] args) {
        Queue<Pair> pairs=new ArrayDeque<>();
        System.out.println("Give row");
        int row;
        int col;
        int[][] oranges;
        try (Scanner sc = new Scanner(System.in)) {
            row = sc.nextInt();
            System.out.println("Give col");
            col = sc.nextInt();
            oranges = new int[row][col];
            for(int i=0 ; i<row; i++)
            {
                for(int j=0 ; j<col ; j++)
                {
                    oranges[i][j]=sc.nextInt();
                }
            }
        }
       int ans= checkForRottenOranges(row, col, oranges, pairs);
       System.out.println(ans);
    }

    private static int checkForRottenOranges(int row, int col, int[][] oranges, Queue<Pair> pairs) {
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                if(oranges[i][j]==2){
                    pairs.add(new Pair(i, j, 0));
                }
            }
        }
        int ans=-1;
        while(!pairs.isEmpty()){
            Pair pair=pairs.remove();
            int crow=pair.row;
            int ccol=pair.col;
            int ctime=pair.time;
            ans=ctime;
            //up
            if(crow-1>=0 && oranges[crow-1][ccol]==1){
                pairs.add(new Pair(crow-1, ccol, ctime+1));
                oranges[crow-1][ccol]=2;
            }
            // right
            if(ccol+1<col && oranges[crow][ccol+1]==1){
                pairs.add(new Pair(crow, ccol+1, ctime+1));
                oranges[crow][ccol+1]=2;
            }
            //down
            if(crow+1<row && oranges[crow+1][ccol]==1){
                pairs.add(new Pair(crow+1, ccol, ctime+1));
                oranges[crow+1][ccol]=2;
            }
            //left
            if(ccol-1>=0 && oranges[crow][ccol-1]==1){
                pairs.add(new Pair(crow, ccol-1, ctime+1));
                oranges[crow][ccol-1]=2;
            }
        }
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                if (oranges[i][j]==1) {
                    return -1;
                }
            }
        }
        return ans;
    }
}



class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}