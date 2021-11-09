package lintcode;

import java.util.HashMap;

/**
 * @author alfred.zhang
 * @date 2021/11/9
 */
public class LRUCache {

    private HashMap<Integer, Node> hashMap;
    private DoubleLinkedList doubleLinkedList;
    private int capacity;


    public LRUCache(int capacity) {
        hashMap = new HashMap<>(capacity);
        doubleLinkedList = new DoubleLinkedList();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!hashMap.containsKey(key)) {
            return -1;
        }
        Node node = hashMap.get(key);
        doubleLinkedList.removeNode(node);
        doubleLinkedList.addHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            node.setValue(value);
            doubleLinkedList.removeNode(node);
            doubleLinkedList.addHead(node);
            return;
        } else {
            Node node = new Node(key, value);
            hashMap.put(key, node);
            doubleLinkedList.addHead(node);

            if (hashMap.size() > capacity) {
                int delKey = doubleLinkedList.removeTail();
                hashMap.remove(delKey);
            }
        }
    }


    public class DoubleLinkedList {
        private Node head;
        private Node tail;
        private int length;

        public DoubleLinkedList() {
            this.head = null;
            this.tail = head;
            length = 0;
        }

        public boolean isEmpty() {
            return length == 0 ? true : false;
        }

        public void addHead(Node node) {
            if (isEmpty()) {
                this.head = node;
                this.tail = node;
                length++;
                return;
            }

            node.next = head;
            node.pre = null;

            head.pre = node;
            head = node;
            length++;
        }

        public int removeTail() {
            if (isEmpty()) {
                return -1;
            }
            if (length == 1) {
                cleanList();
                return tail.getKey();
            }

            int key = tail.getKey();
            tail.pre.next = null;
            tail = tail.pre;
            length--;
            return key;
        }

        public void removeHead() {
            if (isEmpty()) {
                return;
            }
            if (length == 1) {
                cleanList();
                return;
            }
            head.next.pre = null;
            head = head.next;
            length--;
        }

        private void cleanList() {
            tail = null;
            head = null;
            length = 0;
        }

        public void removeNode(Node node) {
            if (node == head) {
                removeHead();
                return;
            }
            if (node == tail) {
                removeTail();
                return;
            }

            node.next.pre = node.pre;
            node.pre.next = node.next;
            length--;
        }
    }


    public class Node {
        private int key;
        private int value;
        private Node pre;
        private Node next;

        public int getKey() {
            return key;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node() {

        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.pre = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        lruCache.put(5, 5);
        lruCache.put(6, 6);

        lruCache.get(1);

    }

}
