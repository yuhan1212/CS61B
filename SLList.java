/** An SLList is a list of integers, which hides the terrible truth 
  * of the nakedness within. */

public class SLList {
    
    private IntNode first;
    private int size;

    /** Create an empty SLList. */
    public SLList() {
        first = null;
        size = 0;
    }
    
    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /**  Add x to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    /** Add an item to the end of the list. */
    public void addLast (int x) {
        size += 1;
        if (first == null) {
            first = new IntNode(x, null);
            return;
        } 
        
        IntNode p = first;

        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Return the first item in the list. */
    public int getFirst() {
        return first.item;
    }

    /** Return the last item in the list. */
    public int getLast() {
        IntNode p = first;
    
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /** Print all int in SLList. */
    public String printSLList() {
        String res = "";
        IntNode p = first;
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
        IntNode p = first;
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
        return size(first);
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