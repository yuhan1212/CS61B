/** Representing the Empty List Using a Sentinel. */

public class DLList {

    private static class IntNode {
        public IntNode prev;
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n, IntNode p) {
            item = i;
            next = n;
            prev = p;
        }
    }
    
    /* The first item (if exists is at sentinel.next) */
    private IntNode sentinel;
    private int size;

    /** Create an empty SLList. */
    public DLList() {
        sentinel = new IntNode(-1, sentinel, sentinel); 
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    
    public DLList(int x) {
        sentinel = new IntNode(-1, sentinel, sentinel);
        sentinel.next = new IntNode(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    } 

    /**  Add x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next, sentinel);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }

    /** Add an item to the end of the list. */
    public void addLast (int x) {
        sentinel.prev = new IntNode(x, sentinel, sentinel.prev);
        sentinel.prev.prev.next = sentinel.prev;
        size += 1;
    }

    /** Return the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Return the last item in the list. */
    public int getLast() {
        return sentinel.prev.item;
    }

    /** Return the ith item in the list. */
    public int getNode(int x) {
        if (x < size / 2 + 1) {
            IntNode p = sentinel;
            for (int i = 0; i < x; i++) {
                p = p.next;
            }
            return p.item;
        }
        else {
            IntNode p = sentinel;
            for (int i = 0; i <= size - x; i++) {
                p = p.prev;
            }
            return p.item;
        }
    }

    public int size() {
        return size;
    }

    /** Print the items in the list. */
    public String printOut() {
        String res = "";
        IntNode p = sentinel.next;
        while (p != sentinel) {
            res += p.item;
            res += " - ";
            p = p.next;
        }
        return res;
    }

    public static void main(String[] args) {
        /** Creates a list of one integer, namely 10 */
        DLList L = new DLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        L.addLast(30);
        L.addLast(40);
        L.addLast(50);
        System.out.println("The first integer in L is: " + L.getFirst());
        System.out.println("The last integer in L is: " + L.getLast());
        System.out.println("L is: " + L.printOut());
        System.out.println("L's size: " + L.size());
        System.out.println("The 3rd integer in L is: " + L.getNode(3));
        System.out.println("The 6th integer in L is: " + L.getNode(6));
        System.out.println("========== start from empty SSL ==========");
        DLList S = new DLList();
        S.addLast(20);
        S.addFirst(15);
        S.addFirst(10);
        S.addFirst(5);
        S.addLast(30);
        S.addLast(40);
        S.addLast(50);
        System.out.println("The first integer in S is: " + S.getFirst());
        System.out.println("The last integer in S is: " + S.getLast());
        System.out.println("S is: " + S.printOut());
        System.out.println("S's size: " + S.size());
        System.out.println("The 3rd integer in S is: " + S.getNode(3));
        System.out.println("The 6th integer in S is: " + S.getNode(6));
    }
}