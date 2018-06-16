package Leet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by B0200901 on 6/13/2018
 */
public class RedundantConn {

    Map<Long, Node> map = new HashMap<>();

    class Node{
        long data;
        Node parent;
        int rank;
    }

    public void makeSet(long data){
        Node node = new Node();
        node.data = data;
        node.parent = node;
        node.rank = 0;
        map.put(data, node);
    }

    public Node findSet(long data){
        Node node = map.get(data);
        if(data == node.parent.data)
            return node;
        else return findSet(node.parent.data);
    }

    public boolean union(long data1, long data2){
       Node parent1 = findSet(data1);
       Node parent2 = findSet(data2);

       if(parent1.data == parent2.data)
           return true;

       if(parent1.rank <= parent2.rank){
           parent1.parent = parent2;
           parent2.rank +=1;
       }
       else{
           parent2.parent = parent1;
           parent1.rank +=1;
       }
       return false;
    }

    public int[] findRedundantConnection(int[][] edges) {

        int[] result = new int[2];

        for(int i=0; i<edges.length; i++){
            if(map.get(edges[i][0])==null)
                makeSet(edges[i][0]);
            if(map.get(edges[i][1]) == null)
                makeSet(edges[i][1]);
        }

        for (int i=0; i<edges.length; i++){
            boolean isCycle = union(edges[i][0], edges[i][1]);
            if(isCycle) {
                result[0] = edges[i][0];
                result[1] = edges[i][1];
            }
        }
        return result;
    }
}
