package Programs;

import BasicClasses.NodeTree;

/**
 * Created by divya on 19/5/16.
 */
class BinaryTree{
    static NodeTree root;
    int v=9;
    int[] euler = new int[2*v-1];
    int[] level = new int[2*v-1];
    int[] f_c = new int[2*v-1];
    int fill;

    public void findLCA(NodeTree root , int u, int v){
        fill=0;
        for(int i=0;i<f_c.length;i++){
            f_c[i]=-1;
        }
       eulerTour(root,0);
        System.out.println("Euler\n");
        for(int i=0;i<euler.length;i++){
            System.out.print(euler[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Level\n");
        for(int i=0;i<level.length;i++){
            System.out.print(level[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<f_c.length;i++){
            System.out.print(f_c[i]+" ");
        }
        System.out.println("\n");
    }

    public void eulerTour(NodeTree root , int l){
        if(root!=null) {
            euler[fill] = root.getData();
            level[fill] = l;
            fill++;

            if(f_c[root.getData()]==-1){
                f_c[root.getData()]=fill-1;
            }
            if(root.getLeft()!=null){
                eulerTour(root.getLeft(),l+1);
                euler[fill] = root.getData();
                level[fill] = l;
                fill++;
            }
            if(root.getRight()!=null) {
                eulerTour(root.getRight(), l + 1);
                euler[fill] = root.getData();
                level[fill] = l;
                fill++;
            }
        }
    }
}