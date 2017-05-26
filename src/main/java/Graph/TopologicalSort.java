package Graph;

/**
 * Created by divya on 14/4/17.
 */
public class TopologicalSort {



}

class GraphK{
    private Vertex[] vertexList ;
    private int adjMatrix[][] ;
    private int vertexCount ;
    private int maxVertices;

    public GraphK(){
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
    }
}

class Vertex{
    private char label;
    private boolean visited ;

    Vertex(char label){
        this.label = label ;
        this.visited = false ;
    }
}
