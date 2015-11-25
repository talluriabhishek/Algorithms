package cracking.linkedlists;

import cracking.Node;

/**
 * Created by abhis_000 on 11/11/15.
 */
public class MyLinkedList {

    Node head = null;

    MyLinkedList(){

    }

    public Node getHead(){
        return head;
    }

    MyLinkedList(Node head){
        this.head = head;
    }

    public void addNodeToLast(Node d){
        if(head == null){
            head = d;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = d;
        return;
    }
    public void addNodeToLast(int d){
        Node temp = new Node(d);
        addNodeToLast(temp);
    }

    public void deleteNode(int data){
        Node n = head;
        if(n.getData() == data){
            head = head.next;
            return;
        }
        while(n.next != null){
            if(n.next.getData() == data){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }

    public Node getNode(int index){
        if(index < 0){
            return null;
        }
        int val  = 0;
        Node temp = head;
        while(val < index && temp!= null){
            temp = temp.next;
            val++;
        }
        return temp;
    }

}
