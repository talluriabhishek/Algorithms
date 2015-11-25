package cracking;

import java.util.ArrayList;

/**
 * Created by abhis_000 on 10/28/15.
 */
public class Subsets {

    public static void main(String[] args){
        /*char[] arr = new char[3];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        toString() ??
        what do we get if we print a char array
        int array
        converting in between array and string and string and array and print all these
        */
        String arr = "abc";
        System.out.println(arr.substring(1, arr.length()));
        subsets(arr);
    }

    public static void subsets(String arr) {

        System.out.print(giveSets(arr));

    }

    private static ArrayList<String> giveSets(String arr){
        ArrayList<String> temp = new ArrayList<String>();

        if(arr.length() == 1){
            temp.add(arr);
            return temp;
        }
        temp = giveSets(arr.substring(1,arr.length()));
        int count = temp.size();
        for(int i = 0;i<count;i++){
            temp.add(temp.get(i) + arr.charAt(0));
        }
        temp.add(arr.substring(0,1));
        return temp;
    }

}
