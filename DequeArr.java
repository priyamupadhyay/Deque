import java.util.*;
public class DequeArr < Item > implements Iterable < Item > {
    private static final int INIT_CAPACITY = 8;

    private Item[] q; // queue elements
    private int n; // number of elements on queue
    private int first; // index of first element of queue
    private int last; // index of next available slot

    public DequeArr() {
        q = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }
    
    public int size() {
        return n;
    }

        // resize the underlying array
        private void resize(int capacity) {
            assert capacity >= n;
            Item[] copy = (Item[]) new Object[capacity];
            for (int i = 0; i < n; i++) {
                copy[i] = q[(first + i) % q.length];
            }
            q = copy;
            first = 0;
            last = n;
        }

        public void addFirst(Item item) {
           
        }

        public void addLast(Item item) {
            
        }

        public Item removeFirst() {
           
        }

        public Item removeLast() {
            
        }

        public Iterator < Item > iterator() {
            return new ArrayIterator();
        }

        private class ArrayIterator implements Iterator < Item > {
            
            }
        }
        public static void main(String[] args) {
            
        }
    }