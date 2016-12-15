package Programs; /**
 * Created by divya on 10/6/16.
 */

import java.util.Scanner;

class OverLapping {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int z=1;z<=testCases;z++){
            Rectangle A = new Rectangle();
            Rectangle B = new Rectangle();
            A.lx = s.nextInt();
            A.ly= s.nextInt();
            A.rx= s.nextInt();
            A.ry= s.nextInt();
            B.lx = s.nextInt();
            B.ly= s.nextInt();
            B.rx= s.nextInt();
            B.ry= s.nextInt();
            boolean find = overlapping(A,B);
            if(find)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

   static boolean overlapping(Rectangle a, Rectangle b){
        if((b.ry>a.ry)&&(b.ry<a.ly)){
            if((b.lx>a.lx)&&(b.lx<a.rx))
                return true;
        }
       if((a.ry>b.ry)&&(a.ry<b.ly)){
           if((a.lx>b.lx)&&(a.lx<b.rx))
               return true;
       }
       if((a.lx>b.lx)&&(a.lx<b.rx))
           if((a.ly>b.ly)&&(a.ly<b.ry))
               return true;
       if((b.lx>a.lx)&&(b.lx<a.rx))
           if((b.ly>a.ry)&&(b.ly<a.ly))
               return true;

        return false;
    }
}

class Rectangle{
    int lx,ly,rx,ry;
}