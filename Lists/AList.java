public class AList<TypeHere>{

    private TypeHere[] items; 
    private int size;
    /** Create an empty list. */
    public AList() {
        items = (TypeHere[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize(int capacity) {
            TypeHere[] a = (TypeHere[]) new Object[capacity];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
    }

    /** Inserts x into the back od the list. */
    public void addLast(TypeHere x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /** Return the item from the back of the list. */
    public TypeHere getLast() {
        return items[size - 1];
    }

    /** Get the ith item in the list (0 is the front). */
    public TypeHere get(int i) {
        return items[i];
    }

    /** Return the numbers of item in the list. */
    public int size() {
        return size;
    }

    /** Deletes the item from back of the list and returns deleted item. */
    public TypeHere removeLast() {
        TypeHere x = getLast();
        items[size - 1] = null;
        size -= 1;  
        return x;
    }
}