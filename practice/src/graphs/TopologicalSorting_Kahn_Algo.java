import java.util.List;
import java.util.Scanner;

public class TopologicalSorting_Kahn_Algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GraphInput input=new GraphInput();
        List<List<Integer>>graph=input.getGraph(sc);
    }
}
