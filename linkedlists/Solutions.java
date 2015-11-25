package cracking.linkedlists;

import cracking.Node;

import java.util.HashMap;

/**
 * Created by abhis_000 on 11/11/15.
 */
public class Solutions {

    public void removeDuplicates1(MyLinkedList list){
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        Node temp = list.getHead();
        while(temp!= null){
            if(map.containsKey(temp.getData())){
                list.deleteNode(temp.getData());
            }else{
                map.put(temp.getData(),true);
            }
            temp = temp.next;
        }
    }

    public int returnKthFromLast2(MyLinkedList list , int k){
        Node temp1,temp2;
        temp1 = list.head;
        temp2 = list.head;
        int tempk = 1;
        while(tempk <= k && temp1 != null){
            temp1 = temp1.next;
            tempk++;
        }
        if(temp1 == null){
            return 0;
        }
        while(temp1.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2.getData();
    }

    public void removeMiddle3(Node mid){
        Node temp = mid;
        if(temp == null || temp.next == null){
            return;
        }
        temp.putData(temp.next.getData());
        temp.next = temp.next.next;
        return;
    }

    public MyLinkedList partition(MyLinkedList list , int x){
        Node current = list.getHead();
        MyLinkedList prev = new MyLinkedList();
        MyLinkedList after = new MyLinkedList();
        while(current != null){
            Node temp = current.next;
            current.next = null;
            if(current.getData() < x){
                prev.addNodeToLast(current);
            }else{
                after.addNodeToLast(current);
            }
            current = temp;
        }
        Node temp = prev.getHead();
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = after.getHead();
        return prev;
    }

    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList(new Node(1));
        list.addNodeToLast(2);
        list.addNodeToLast(3);
        list.addNodeToLast(4);
        list.addNodeToLast(5);
        list.addNodeToLast(6);
        list.addNodeToLast(4);
        list.addNodeToLast(1);
        //list.deleteNode(1);
        Solutions s = new Solutions();
        Node temp = list.head;
        while(temp!= null){
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();

        list = s.partition(list,3);

        temp = list.head;
        while(temp!= null){
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}
