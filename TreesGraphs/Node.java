package cracking.TreesGraphs;

/**
 * Created by abhis_000 on 11/6/15.
 */
public class Node {

    int data ;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public void setLeft(Node n){
        this.left = n;
    }

    public void setRight(Node n){
        this.right = n;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public int getData(){
        return data;
    }

}
