
    public class LinkedList<K,V> {
        private NodeMap head = null;
        private NodeMap tail = null;

        public void append(NodeMap end) {

            NodeMap node = head;
            tail = end;
            if (head == null) {
                head = end;
            } else {
                while (node.getNext() != null) {
                    node = node.getNext();
                }
                node.setNext(end);
            }
        }

        public NodeMap<K,V> search(K key) {
            NodeMap temp = head;
            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    return temp;
                }
                temp = temp.getNext();
            }
            return null;
        }

        public void printLinkedList() {
            NodeMap node = head;
            while (node != null) {
                System.out.print(node);
                if (node != tail) {
                    System.out.print(" -> ");
                }
                node = node.getNext();
            }
        }
    }
