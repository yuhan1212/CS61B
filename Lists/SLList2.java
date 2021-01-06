/** Representing the Empty List Using a Sentinel. */

public class SLList2 {
    
    /* The first item (if exists is at sentinel.next) */
    private IntNode sentinel;
    private int size;

    /** Create an empty SLList. */
    public SLList2() {
        sentinel = new IntNode(-1, null);
        size = 0;
    }
    
    public SLList2(int x) {
        sentinel = new IntNode(-1, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /**  Add x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Add an item to the end of the list. */
    public void addLast (int x) {
        size += 1;
        
        IntNode p = sentinel;

        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Return the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Return the last item in the list. */
    public int getLast() {
        IntNode p = sentinel;
    
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int size() {
        return size;
    }
 

    public static void main(String[] args) {
        /** Creates a list of one integer, namely 10 */
        SLList2 L = new SLList2(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println("The first integer in L is: " + L.getFirst());
        System.out.println("The last integer in L is: " + L.getLast());
        System.out.println("fastest way to get size: " + L.size());
        System.out.println("========== start from empty SSL ==========");
        SLList2 S = new SLList2();
        S.addLast(20);
        S.addFirst(10);
        S.addFirst(5);
        System.out.println("The first integer in S is: " + S.getFirst());
        System.out.println("The last integer in S is: " + S.getLast());
        System.out.println("fastest way to get size: " + S.size());
    }

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

}