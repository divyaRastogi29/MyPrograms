package Programs;

import java.util.Stack;

/**
 * Created by divya on 28/3/17.
 */
public class StackReversal {


    public void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int n = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, n);
    }

    public void insertAtBottom(Stack<Integer> stack, int n){
        if(stack.isEmpty()) {
            stack.push(n);
            return;
        }
        insertAtBottom(stack, stack.pop());
        stack.push(n);
    }
}
