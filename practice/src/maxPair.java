
import java.util.HashMap;

public class maxPair {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        calculatePair(a,b);
    }
    // i<=j and a[i]-b[j]=a[j]-b[i];
    // a[i]+b[i]=a[j]+b[j];
    public static void calculatePair(int a[],int []b){
            int count=0;
            for(int i=0 ; i<a.length ; i++)
            {
                for(int j=i ; j<a.length ; j++)
                {
                    if(a[i]-b[j]==a[j]-b[i])count++;
                }
            }
            HashMap<Integer,Integer> ma=new HashMap<>();
            HashMap<Integer,Integer> mb=new HashMap<>();
            System.out.println(count);
        }

}
