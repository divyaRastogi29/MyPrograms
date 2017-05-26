package Threading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by divya on 31/3/17.
 */
public class ConsumeWhenProductionIsOver {

    public static void main(String[] args) {
        Queue<Integer> sharedQueue = new LinkedList<>();
        Boolean isProductionRunning = true ;
        Produces produces = new Produces(sharedQueue, isProductionRunning) ;
        Thread produce = new Thread(produces);
        Thread consume = new Thread(new Consumes(produces));
        produce.start();
        consume.start();
    }
}

class Produces implements Runnable{
    Queue<Integer> sharedQueue ;
    Boolean isProductionRunning ;

    Produces( Queue<Integer> sharedQueue, Boolean isProductionRunning){
        this.sharedQueue = sharedQueue ;
        this.isProductionRunning = isProductionRunning ;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        for(int i=0;i<=10;i++){
            sharedQueue.add(i);
            System.out.println("PRODUCED : "+i);
        }
        System.out.println("PRODUCTION DONE.");
        isProductionRunning = false ;
    }
}

class Consumes implements Runnable{
    Produces produces ;

    Consumes( Produces produces){
        this.produces = produces ;
    }
    @Override
    public void run() {
        while(produces.isProductionRunning){
            System.out.println("Production is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

        System.out.println("Production is over . consumption can be done .");
        for(int i=0;i<10;i++)
            System.out.println("CONSUMPTION : "+produces.sharedQueue.remove());
    }
}
