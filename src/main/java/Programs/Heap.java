package Programs;

/**
 * Created by divya on 21/5/16.
 */
public class Heap {
    private int[] array;
    private int count;
    private int capacity;
    Heap(int[] a,int capacity){
        this.array=a;
        this.count=a.length-1;
        this.capacity=capacity-1;
    }
    public void setArray(int[] a){
        this.array=a;
        this.count=a.length-1;
    }
    public int getParent(int i){
        if((i<=0)||(i>this.count))
            return -1;
        return ((i-1)/2);
    }

    public int getLeft(int i,Heap h){
        int left = (2*i+1);
        if(left>h.getCount())
            return -1;
        return left;
    }

    public int getRight(int i,Heap h){
        int right = (2*i+2);
        if(right>h.getCount())
            return -1;
        return right;
    }
    public int getMaximum(){
        if(this.count==0)
            return -1;
        return array[0];
    }

    public int getCount(){
        return this.count;
    }
    public int getCapacity(){
        return capacity;
    }
    public int[] getArray(){
        return array;
    }

    public Heap reSize(Heap h){
        Heap h2 = new Heap(h.getArray(),(2*h.getCapacity()));
        return h2;
    }

}
