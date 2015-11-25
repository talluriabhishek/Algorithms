package cracking;

/**
 * Created by abhis_000 on 9/21/15.
 */
//Make it generic
public class Node {
    public Node next = null;
    int data ;

    public Node (int data){
        this.data = data;
    }


    public int getData(){
        return data;
    }

    public void putData(int data){
        this.data = data;
    }

}
