
    public class NodeMap<K,V>
    {
        K key;
        V value;
        NodeMap next;

        public NodeMap(K key, V value) {
            this.key=key;
            this.value=value;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public NodeMap<K,V> getNext() {
            return next;
        }

        public void setNext(NodeMap<K,V> next) {
            this.next = next;
        }

        public String toString(){
            StringBuilder strBuild = new StringBuilder();
            strBuild.append("{ K= ").append(key).append(", V= ").append(value).append(" }");
            if(next!=null)
                strBuild.append("->");
            return strBuild.toString();
        }
    }
