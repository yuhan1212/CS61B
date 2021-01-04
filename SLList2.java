/** An SLList is a list of integers, which hides the terrible truth 
  * of the nakedness within. */

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
        
        IntNode p = sentinel.next;

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
        IntNode p = sentinel.next;
    
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /** Print all int in SLList. */
    public String printSLList() {
        String res = "";
        IntNode p = sentinel.next;
        while (p.next != null) {
            res += p.item;
            res += "-";
            p = p.next;
        }
        res += p.item;
        return res;
    }

    /** My way to get the size of the list. */
    public int getSize() {
        IntNode p = sentinel.next;
        int size = 0;
        while (p.next != null) {
            size += 1;
            p = p.next;
        }
        size += 1;
        return size;
    }

    /** Returns te size of the list that start at IntNode p. */
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }

        return 1 + size(p.next);
    }
    
    public int size() {
        return size(sentinel.next);
    }

    public int fastGetSize() {
        return size;
    }
 

    public static void main(String[] args) {
        /** Creates a list of one integer, namely 10 */
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println("The first integer in L is: " + L.getFirst());
        System.out.println("The last integer in L is: " + L.getLast());
        System.out.println("L is: " + L.printSLList());
        System.out.println("The length of L is: " + L.getSize());
        System.out.println("recursive way to get size: " + L.size());
        System.out.println("fastest way to get size: " + L.fastGetSize());
        System.out.println("========== start from empty SSL ==========");
        SLList S = new SLList();
        S.addLast(20);
        S.addFirst(10);
        S.addFirst(5);
        System.out.println("The first integer in L is: " + S.getFirst());
        System.out.println("The last integer in L is: " + S.getLast());
        System.out.println("L is: " + S.printSLList());
        System.out.println("The length of L is: " + S.getSize());
        System.out.println("recursive way to get size: " + S.size());
        System.out.println("fastest way to get size: " + S.fastGetSize());
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