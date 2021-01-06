/** Singly linked list with any consist type. */

public class SLListAddType<Type> {
    
    private TypeNode first;
    private int size;

    /** Create an empty SLListAddType. */
    public SLListAddType() {
        first = null;
        size = 0;
    }
    
    public SLListAddType(Type x) {
        first = new TypeNode(x, null);
        size = 1;
    }

    /**  Add x to the front of the list. */
    public void addFirst(Type x) {
        first = new TypeNode(x, first);
        size += 1;
    }

    /** Add an item to the end of the list. */
    public void addLast (Type x) {
        size += 1;
        if (first == null) {
            first = new TypeNode(x, null);
            return;
        } 
        
        TypeNode p = first;

        /* Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new TypeNode(x, null);
    }

    /** Return the first item in the list. */
    public Type getFirst() {
        return first.item;
    }

    /** Return the last item in the list. */
    public Type getLast() {
        TypeNode p = first;
    
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /** Print all in SLListAddType. */
    public String printSLListAddType() {
        String res = "";
        TypeNode p = first;
        while (p.next != null) {
            res += p.item;
            res += "-";
            p = p.next;
        }
        res += p.item;
        return res;
    }

    /** Get the size of the list. */
    public int size() {
        return size;
    }
 

    public static void main(String[] args) {
        SLListAddType<String> L = new SLListAddType<>("a");
        L.addFirst("b");
        L.addFirst("c");
        L.addLast("d");
        System.out.println("The first in L is: " + L.getFirst());
        System.out.println("The last in L is: " + L.getLast());
        System.out.println("L is: " + L.printSLListAddType());
        System.out.println("Size of L: " + L.size());
        System.out.println("========== start from empty SSL ==========");
        SLListAddType<Double> S = new SLListAddType<>();
        S.addLast(20.2);
        S.addFirst(10.1);
        S.addFirst(5.5);
        System.out.println("The first in S is: " + S.getFirst());
        System.out.println("The last in S is: " + S.getLast());
        System.out.println("L is: " + S.printSLListAddType());
        System.out.println("Size of S: " + S.size());
    }

    private class TypeNode {
        public Type item;
        public TypeNode next;

        public TypeNode(Type i, TypeNode n) {
            item = i;
            next = n;
        }
    }

}