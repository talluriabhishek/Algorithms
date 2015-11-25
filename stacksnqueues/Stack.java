package cracking.stacksnqueues;

import cracking.Node;

/**
 * Created by abhis_000 on 9/23/15.
 */
public class Stack {

    Node top = null;

    public Stack(Node n ){
        this.top = n;
    }

    public Stack(){
        top = null;
    }

    void push(Node n){
        n.next = top;
        top = n;
    }

    Node pop(){
        if(top != null) {
            Node temp = top;
            top = top.next;
            return temp;
        }
        return null;
    }



}
