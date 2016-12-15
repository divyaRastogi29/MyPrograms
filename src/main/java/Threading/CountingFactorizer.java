package Threading;

/**
 * Created by divya on 18/10/16.
 */

public class CountingFactorizer implements Runnable{

    public void run() {
        System.out.println("\nCurrently running thread is : "+Thread.currentThread().getId());
    }

    public static void main(String[] args){

        for(int i =1 ; i<= 10 ; i ++){
            Thread a = new Thread(new CountingFactorizer()) ;
            a.start();
        }
    }

}

