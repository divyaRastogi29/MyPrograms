package Amazon;

import java.util.Stack;

/**
 * Created by divya on 8/12/16.
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        nextGreatest(arr);
    }

    public static void nextGreatest(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int element;

        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            int next = arr[i];

            if(!stack.isEmpty()){
               element = stack.pop();
                while(next>element){
                    System.out.println(element+" ---- "+next);
                    if(stack.isEmpty())
                        break;
                    element =stack.pop();
                }

                if(next<element){
                    stack.push(element);
                }
            }
            stack.push(next);
        }

        while(!stack.isEmpty()){
             element = stack.pop();
            int next = -1;
            System.out.println(element+" ---- "+next);
        }
    }
}
