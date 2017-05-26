package Programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 28/3/17.
 */
public class DFS {
}

class GraphDfs{
    private int V;
    private LinkedList<Integer> adj[] ;

    GraphDfs(int V){
        this.V = V ;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }

    void DFSUtil(boolean[] visited, int s){
        visited[s] = true ;
        System.out.println("  "+s);
        Iterator<Integer> iterator = adj[s].iterator();
        while (iterator.hasNext()){
            Integer a = iterator.next() ;
            if(!visited[a])
                DFSUtil(visited, a);
        }
    }

    void DFS(int s){
        boolean[] visited = new boolean[V];
        DFSUtil(visited, s);
    }

}
