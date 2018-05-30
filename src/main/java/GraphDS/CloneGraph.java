package GraphDS;

import java.util.*;

/**
 * Created by B0200901 on 5/29/2018
 */

public class CloneGraph {


    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) {
            label = x; neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        Map<Integer, UndirectedGraphNode> visited = new HashMap<>();

        return cloneGraphUtil(node, visited);
    }

    public UndirectedGraphNode cloneGraphUtil(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> visited) {

        if(node == null)
            return node;
        if(visited.get(node.label) != null)
            return visited.get(node.label);
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        Iterator<UndirectedGraphNode> iterator = node.neighbors.iterator();
        visited.put(node.label, clone);
        while (iterator.hasNext()){
            clone.neighbors.add(cloneGraphUtil(iterator.next(), visited));
        }

        return clone;
    }
}
