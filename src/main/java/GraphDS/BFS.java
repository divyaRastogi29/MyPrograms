package GraphDS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 11/4/17.
 */
public class BFS {

    private int v;
    private LinkedList<Integer> adj[];

    BFS(int v){
        this.v = v;
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;

        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.println(" "+s);

            Iterator<Integer> iterator = adj[s].iterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int s){
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++) {
            if(!visited[i])
            DFSUtil(s, visited);
        }
    }

    private void DFSUtil(int s, boolean[] visited) {

      visited[s]=true ;
        System.out.println(s);
        Iterator<Integer> iterator = adj[s].iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }

    }
}
