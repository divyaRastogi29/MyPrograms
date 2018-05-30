package GraphDS;

import java.util.Iterator;

/**
 * Created by B0200901 on 5/28/2018
 */
public class DepthFirstSearch {

    private Graph<Integer> graph;

    public DepthFirstSearch(Graph<Integer> graph) {
        this.graph = graph;
    }

    public void getDfs() {
        boolean[] visited = new boolean[graph.getAllVertex().size()];

        Iterator<Vertex<Integer>> allVertex = graph.getAllVertex().iterator();

        while (allVertex.hasNext()){
            Vertex vertex = allVertex.next();
            if(!visited[(int)vertex.getId()])
                DfsUtil(vertex, visited);
        }

    }
    private void DfsUtil(Vertex vertex, boolean[] visited){
       visited[(int)vertex.getId()] = true;
        System.out.println(vertex.getData());
       Iterator<Vertex> iterator = vertex.getAdjacentVertexes().iterator();
        while (iterator.hasNext()){
            Vertex vertex1 = iterator.next();
            if(!visited[(int)vertex1.getId()])
                DfsUtil(vertex1, visited);
        }

    }

}
