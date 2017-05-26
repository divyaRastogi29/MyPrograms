package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by divya on 29/3/17.
 */
public class MotherVertex {

    private class Graph{
        int v ;
        LinkedList<Integer> adj[] ;
        Graph(int v){
            this.v = v ;
        }

        public void addEdge(Graph g, int u, int v){
            g.adj[u].add(v);
        }

        public void DFS(Stack stack, int i, boolean[] visited){
            visited[i] = true;
            Iterator<Integer> iterator = adj[i].iterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n])
                    DFS(stack, n, visited);
            }
            stack.push(i);
        }

        public void DFSUtil(int i, boolean[] visited){
            visited[i] = true;
            Iterator<Integer> iterator = adj[i].iterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n])
                    DFSUtil(n, visited);
            }
        }

        public int getMotherVertex(){
            boolean[] visited = new boolean[v];
            for(int i=0; i<v; i++){
                visited[i] = false ;
            }

            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<v; i++){
                if(!visited[i]){
                    DFS(stack, i, visited);
                }
            }

            int motherElement = stack.pop();
            for(int i=0; i<v; i++){
                visited[i] = false ;
            }
            DFSUtil(motherElement, visited);
            for(int i=0;i<v;i++){
               if(visited[i]==false)
                   return -1;
            }
            return motherElement ;
        }
    }
}


