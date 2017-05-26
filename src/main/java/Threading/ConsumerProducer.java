package Threading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 30/3/17.
 */

public class ConsumerProducer {

    public static void main(String[] args){
        ShareableQueue queue = new ShareableQueue();
        Thread producer = new Thread(new ProduceConsumeTask(queue, 10, true));
        Thread consumer = new Thread(new ProduceConsumeTask(queue, 10, false));
        producer.start();
        consumer.start();
    }
}

class ProduceConsumeTask implements Runnable{
    ShareableQueue shareableQueue ;
    int maxProducts ;
    boolean produce ;
    int i=0;
    ProduceConsumeTask(ShareableQueue shareableQueue, int maxProducts , boolean produce){
        this.shareableQueue = shareableQueue ;
        this.maxProducts = maxProducts ;
        this.produce = produce ;
    }
    @Override
    public void run() {
        while(i<maxProducts){
            if(produce){
                shareableQueue.produce(++i);
            }
            else {
                shareableQueue.consume();
            }
        }
    }
}

class ShareableQueue{
    Queue<Integer> queue = new LinkedList<>();
    boolean consume = false;
    int i=0;
    public synchronized  void produce(int i){
        while((consume == true)||(queue.size()>=2)){
            try {
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("PRODUCED : "+ i);
        queue.add(i);
        if(queue.size()==2) {
            consume = !consume;

        }
        notifyAll();

    }

    public synchronized void consume(){
        while((consume == false)||(queue.isEmpty())){
            try {
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        if(!queue.isEmpty()) {
            System.out.println("CONSUMED : "+queue.remove());
            if(queue.size()==0) {
                consume = !consume;
                notifyAll();
            }

        }
    }
}


