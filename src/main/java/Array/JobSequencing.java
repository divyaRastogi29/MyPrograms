package Array;

/**
 * Created by b0200901 on 7/2/2018
 */
public class JobSequencing {

    public static void main(String[] args) {

    }
}

class Disjoint{

    private int[] parent;

    public void init(int n){
        parent = new int[n+1];
        for(int i=0; i<=n; i++){
            parent[i] = i;
        }
    }

    void merge(int u, int v){
        parent[u] = v;
    }

    int find(int u){
        if(u == parent[u])
            return u;
        return find(parent[u]);
    }
}