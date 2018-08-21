package Leet;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion {


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {

        StringBuilder[] buffer = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++)
            buffer[i]= new StringBuilder("");

        for(int i=0; i<s.length();){

            for(int j=0;j<numRows; j++){
                if(i<s.length())
                buffer[j]=buffer[j].append(s.charAt(i++));
            }

            for(int j=numRows-2; j>=1;j--){
                if(i<s.length())
                buffer[j]=buffer[j].append(s.charAt(i++));
            }
        }

        StringBuilder result = new StringBuilder("");
        for(int i=0;i<numRows;i++)
            result.append(buffer[i]);
        return result.toString();
    }
}
