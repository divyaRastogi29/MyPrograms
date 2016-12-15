package Programs;

/**
 * Created by divya on 8/6/16.
 */
public class TripletProduct {
    public int tripletProduct(int[] a){
        int maxA = -9999 , maxB = -9999 , maxC=-9999, minA=999999, minB = 999999;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = a[i];
            }
           else if(a[i]>maxB){
                maxC=maxB;
                maxB = a[i];
            }
            else if(a[i]>maxC)
                maxC=a[i];

            if(a[i]<minA){
                minB = minA;
                minA = a[i];
            }
            else if(a[i]<minB){
                minB =a[i];
            }
        }
        return  max((maxA*maxB*maxC),(minA*minB*maxA));
    }

    public int max(int a, int b){
        return (a>b)?a:b;
    }
}
