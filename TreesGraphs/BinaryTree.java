package cracking.TreesGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by abhis_000 on 11/6/15.
 */
public class BinaryTree {

    Node root;

    BinaryTree(Node root){
        this.root = root;
    }

    public void addNode(Node n){
        Node temp = root;
        Node parent = root;
        while(temp != null){
            parent = temp;
            if(n.getData() <= temp.getData()){
                temp = temp.getLeft();
            }else{
                temp = temp.getRight();
            }
        }
        if(parent.getData() > n.getData()){
            parent.setLeft(n);
        }else{
            parent.setRight(n);
        }
    }

    public void bft(){
        Queue<Node> q = new LinkedList<Node>();
        Node temp ;
        q.add(root);
        visit(root);
        while(!q.isEmpty()){
            temp = q.remove();
            if(temp.getLeft() != null){
                q.add(temp.getLeft());
                visit(temp.getLeft());
            }
            if(temp.getRight() != null){
                q.add(temp.getRight());
                visit(temp.getRight());
            }
        }
    }

    private void dftUtil(Node n){
        if(n != null){
            visit(n);
            dftUtil(n.getLeft());
            dftUtil(n.getRight());
        }


    }
    public void dft(){
        dftUtil(root);
    }

    public void visit(Node n){
        System.out.print("Node " + n.getData() + "visited \n");
    }

    public void altLevelTraversal(String addr){

    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(new Node(5));
        tree.addNode(new Node(2));
        tree.addNode(new Node(7));
        tree.addNode(new Node(3));
        tree.addNode(new Node(1));
        tree.altLevelTraversal("127.4.5.55:5300");
    }
}
