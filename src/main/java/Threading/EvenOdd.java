package Threading;

/**
 * Created by divya on 30/11/16.
 */
public class EvenOdd {
    public static void main(String[] args)throws InterruptedException{
        Print print = new Print();
        Even even = new Even(print);
        Odd odd = new Odd(print);
        Thread eveOne = new Thread(even);
        eveOne.start();
        new Thread(odd).start();
    }
}

class Even implements Runnable{
    private Print print ;
    Even(Print print){
        this.print = print ;
    }
    public void run() {
        for(int i=0;i<=20;i=i+2){
            print.printEven(i);
        }
    }
}

class Odd implements Runnable{
    private Print print ;
    Odd(Print print){
        this.print = print ;
    }
    public void run() {
        for(int i=1;i<=20;i=i+2) {
            print.printOdd(i);
        }
    }
}

class Print{
    boolean isOdd = false;
    public synchronized void  printEven(int num) {
        while (isOdd==true){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + num);
        isOdd = true;
        notifyAll();
    }

    public synchronized void printOdd(int num){
        while (isOdd==false){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Odd : " + num);
        isOdd=false;
        notifyAll();
    }
}