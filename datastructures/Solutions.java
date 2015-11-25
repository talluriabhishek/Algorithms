package cracking.datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by abhis_000 on 11/9/15.
 */
public class Solutions {

    public boolean permutationString3(String s1,String s2){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i< s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }
        for(int j = 0;j<s2.length(); j++){
            if(map.containsKey(s2.charAt(j))){
                map.put(s2.charAt(j),map.get(s2.charAt(j))-1);
            }else{
                return false;
            }

            if(map.get(s2.charAt(j)) == 0){
                map.remove(s2.charAt(j));
            }
        }
        if(map.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public String replaceSpace4(char[] s1,int len){
        //For doing this in place, we have to consider the string in reverse and then
        //start replacing the characters.

        int i = len -1;
        int index = s1.length - 1;
        while(i >= 0){
            if(s1[i] == ' '){
                s1[index] = '0';
                s1[index-1] = '2';
                s1[index-2] = '%';
                index = index-3;
            }else{
                s1[index] = s1[i];
                index--;
            }
            i--;
        }
        for(int in = 0;in<s1.length;in++){
            System.out.print(s1[in]);
        }
        System.out.println();
        return new String(s1);
    }

    public String charCount5(String s1){
        char[] arr = new char[s1.length()];
        int index = 0;
        if(s1.length() == 0){
            return s1;
        }
        arr[index++] = s1.charAt(0);
        int count = 1;
        for(int i = 1;i<s1.length();i++){
            if(index == s1.length()){
                return s1;
            }
            if(s1.charAt(i) == arr[index - 1]){
                count++;
            }else{
                arr[index++] = (char)('0'+ count);
                if(index == s1.length()){
                    return s1;
                }else{
                    arr[index++] = s1.charAt(i);
                }
                count = 1;
            }
        }
        arr[index] = (char)('0'+ count);
        return new String(arr);
    }

    public int[][] rotateMatrix6(int[][] matrix){

        int length = matrix.length;
        for(int i = 0;i<Math.floor(length/2);i++){
            for(int j = 0;j<length-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - j][i];
                matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j];
                matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i];
                matrix[j][length - 1 - i] = temp;
            }
        }
        return matrix;
    }

    public int[][] makeZeroes7(int[][] matrix){
        HashSet<Integer> setRow = new HashSet<Integer>();
        HashSet<Integer> setColumn = new HashSet<Integer>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows;i++){
            for(int j = 0;j< columns;j++){
                if(matrix[i][j] == 0){
                    setRow.add(i);
                    setColumn.add(j);
                }
            }
        }
        Iterator<Integer> it = setRow.iterator();
        while(it.hasNext()){
            int row = it.next();
            for(int j = 0;j < columns;j++){
                matrix[row][j] = 0;
            }
        }
        it = setColumn.iterator();
        while(it.hasNext()){
            int column = it.next();
            for(int i = 0;i < rows;i++){
                matrix[i][column] = 0;
            }
        }
        return matrix;

    }



    public static void main(String[] args){
        Solutions s = new Solutions();
        //System.out.print(s.permutationString3("aabh", "bhas"));
        //System.out.print(s.replaceSpace4("Mr John Smith     ".toCharArray(),13));
        //System.out.print(s.charCount5("aabcaaa"));
        int[][] matrix = s.makeZeroes7(new int[][]{{1, 2, 3}, {4, 0, 6}, {7, 8, 9}});
        for(int i = 0 ; i<matrix.length;i++){
            System.out.print(Arrays.toString(matrix[i]));
        }
        //System.out.print(s.rotateMatrix6(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));

    }
}
