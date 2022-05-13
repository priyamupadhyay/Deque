import java.util.*;

public class Deque<Item> implements Iterable<Item> {
    public Node first,last;
    private int n;
    private class Node{
        Item data;
        Node next;
    }
    // construct an empty deque
    public Deque(){
        first=null;
        last=null;
        n=0;
    }

    // is the deque empty?
    public boolean isEmpty(){
        if (first ==null || last == null){
            return false;
        }
        else{
            return true;
        
        }
    }

    // return the number of items on the deque
    public int size(){
        return n;
    }

    // add the item to the front
    public void addFirst(Item item){
        if (item == null) throw new IllegalArgumentException();
        Node old = first;
        first = new Node();
        first.data= item;
        first.next = old;
        n=n+1;
        if (last == null){
            last = first;
        }
    }

    // add the item to the back
    public void addLast(Item item){
        
    }

    // remove and return the item from the front
    public Item removeFirst(){
        
    }

    // remove and return the item from the back
    public Item removeLast(){
        
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
        return new hasIterator();
    }
    public class hasIterator implements Iterator<Item>{
        
    }


    // unit testing (required)
    public static void main(String[] args){
        Deque Deque1 = new Deque();
        System.out.println(Deque1.isEmpty());
        Deque1.addFirst("Priyam");
        Deque1.addFirst("Upadhyay");

}


}