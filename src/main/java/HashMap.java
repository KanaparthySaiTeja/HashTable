public class HashMap<K,V> {

    LinkedList<K,V> list;

    public HashMap(){
        list=new LinkedList();
    }

    public V get(K key) {
        NodeMap<K,V> mapNode = (NodeMap<K, V>) list.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        NodeMap<K,V> mapNode = (NodeMap<K, V>) list.search(key);
        if(mapNode==null){
            mapNode = new NodeMap<>(key,value);
            list.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "HashNodes {"+ list + "}";
    }
}
