public class Node implements Comparable<Node>{
int vertex;
int weight;

Node(int vertex,int weight){
    this.vertex=vertex;
    this.weight=weight;
}

@Override
public int compareTo(Node o) {
    return Integer.compare(this.weight, o.weight);
}
}
