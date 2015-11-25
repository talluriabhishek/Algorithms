package cracking.stacksnqueues;

import cracking.Node;

/**
 * Created by abhis_000 on 9/23/15.
 */
public class Queue {

    Node head = null;
    Node tail = null;

    public Queue(Node n){
        head = n;
        tail = n;
    }

    public Queue(){
    }

    public void enqueue(Node n){
        if(head == null){
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    public Node dequeue(){
        if(head != null){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
        return head;
    }
}
