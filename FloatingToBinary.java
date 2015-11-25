package cracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by abhis_000 on 10/26/15.
 */
public class FloatingToBinary {

    public static void convertFloatingToBinary(double d){

        int whole = (int)Math.floor(d);
        Stack<Integer> st = new Stack<Integer>();

        while(whole > 0){
            Integer i = whole % 2;
            st.push(i);
            whole = whole/2 ;

        }
        while(!st.empty()){
            System.out.print(st.pop());
        }

        System.out.print(".");
        double temp = d - (int)Math.floor(d);
        HashSet<Double> set = new HashSet<Double>();
        int count = 20;
        while(temp != 0){
            if(set.contains(temp)){
                System.out.print("Cannot be converted");
                break;
            }else{
                set.add(temp);
            }
            if(temp * 2 >= 1){
                System.out.print(1);
                temp = temp*2 - 1;
            }else{
                System.out.print(0);
                temp = temp * 2;
            }
            count = count - 1;
        }

    }

    public static void main(String[] args){
        convertFloatingToBinary(0.1);
    }
}
