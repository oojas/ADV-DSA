import java.util.Arrays;

public class App  {
    public static void main(String[] args) throws Exception {
        String []ans=new String[10];
        for(int i=0 ; i<10 ; i++)
        {
            ans[i]=String.valueOf(i);
        }
  Arrays.stream(ans).sorted().forEach((String name)->System.out.print(name + " "));

    }
}
