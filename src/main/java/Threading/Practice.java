package Threading;

/**
 * Created by divya on 6/12/16.
 */
public class Practice {
    public static void main(String[] args){
        ThreadOne task = new ThreadOne();
        final Thread thread = new Thread(task);
        thread.start();

       /* new Thread(new Runnable() {
            public void run() {
                thread.interrupt();
                thread.interrupt();
                thread.interrupt();
            }
        }).start();*/
    }
}

class ThreadOne implements Runnable{

    public void run() {
        for(int i=1;i<=3;i++){
            try{
               throw new InterruptedException();
            }
            catch (InterruptedException e){
                System.out.println("Exception came here");
            }
            System.out.println("\nHello");
        }
    }
}
