package cracking.sorting;

/**
 * Created by abhis_000 on 10/17/15.
 */
import cracking.Node;
//Make it generic for all the types
public class QuickSort {

    public static Node[] sort(Node[] array){
        int i = -1,j=0,k = array.length;
        Node pivot = array[k];
        while(k != 0){
            for(int l = 0;l<k-1;l++){
                i = i + 1;
                if(array[j].getData() < array[k].getData()){
                    j = j+1;
                }else{

                }
            }
            k = k-1;
            pivot = array[k];
        }
        return array;
        
    }



}
