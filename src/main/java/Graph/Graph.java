package Graph;

/**
 * Created by divya on 10/11/16.
 */
public class Graph {

    class Edge implements Comparable<Edge>{

        int source , destination, weight ;

        public int compareTo(Edge o) {
            return this.weight-o.weight ;
        }
    };

    class Subset{
        int parent , rank;
    };

    int V, E;
}
