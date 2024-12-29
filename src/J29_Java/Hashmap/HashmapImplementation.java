//package Sheryians_ClassWork_Prob.Hashmap;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//
//public class HashmapImplementation {
//    static class MyHashmap<K,V> {     // here K and V are data type jo hum aabhi nahi bata rahe hai .. jab hum class ka obj banate time hum bata sakte hai
//        public static final int DEFAULT_CAPACITY = 4;
//        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
//        private class Node{
//            K key;
//            V value;
//            Node(K key, V value){
//                this.key = key;
//                this.value = value;
//            }
//        }
//        private LinkedList<Node>[] buckets;
//        private int n; // to keep track of no of entries
//
//        private void initBuckets(int N){     // N -> capacity/size of the buckets
//            buckets = new LinkedList[N];
//            for(int i = 0; i< buckets.length; i++){
//                buckets[i] = new LinkedList<>();
//            }
//        }
//        private int HashFunc(K key){
//            int hc = key.hashCode();
//            return (Math.abs(hc))%buckets.length;
//        }
//        public MyHashmap(){
//            initBuckets(DEFAULT_CAPACITY);
//        }
//
//        public int size(){  // return the number of entries in the map
//            return n;
//        }
//        public void put(K key, V Value){    // Insert/Update
//            int bi = HashFunc(key);
//        }
//        public V get(K key){
//
//        }
//        public V remove(K key){
//
//        }
//    }
//
//    public static void main(String[] args) {
//        HashMap<String,Integer> mp = new HashMap<>();
//        HashMap<String,String> mp2 = new HashMap<>();
//    }
//}
