package Programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 20/5/16.
 */
public class Bfs {
}

class Graph{
    private int v;
    private LinkedList<Integer> adj[];
    Graph(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    void BFS(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s]=true;
        while(queue.size()!=0){
            int temp = queue.poll();
            System.out.print(" "+temp);
            Iterator<Integer> itr = adj[temp].iterator();
            while(itr.hasNext()){
                int k = itr.next();
                if(!visited[k]){
                    visited[k]=true;
                    queue.add(k);
                }
            }
        }
    }
}
