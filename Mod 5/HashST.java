/**
 * Implement the following methods for HashST.java (pg. 638 in your textbook):
 * 
 * contains(): Returns true if this symbol table contains the specified key.
 * size(): Returns the number of key-value pairs in this symbol table.
 * keys(): Returns all keys in the symbol table.
 */
public class HashST<Key, Value> {
    private int m = 1024;
    private Node[] lists = new Node[m];
    private int n = 0;

    private static class Node {
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode() % m);
    }

    public Value get(Key key) {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next)
            if (key.equals(x.key)) {
                return (Value) x.val;
            }
        return null;
    }

    public void put(Key key, Value val) {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        lists[i] = new Node(key, val, lists[i]);
        n++;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public int size() {
        return n;
    }

    public Object[] keys() {
        Object[] keys = new Object[size()];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (Node x = lists[i]; x != null; x = x.next) {
                keys[index++] = x.key;
            }
        }
        return keys;
    }

    void main() {
        HashST<String, Integer> st = new HashST<>();
        st.put("Valeria", 1);
        st.put("Celeste", 2);
        st.put("Fior", 3);
        st.put("Cassius", 4);
        IO.println("Size: " + st.size());
        IO.println(st.contains("Valeria"));
        IO.println(st.contains("Scathanna"));
        IO.println(st.contains("Lianor"));
        for (Object s : st.keys()) {
            IO.print(s + " ");
        }
    }
}
