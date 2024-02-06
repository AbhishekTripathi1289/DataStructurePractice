package com.example.datastructurepractice.linkedList;

import java.util.HashMap;
        import java.util.Map;

class LruCacheImplementation {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node dummyHead;
    private final Node dummyTail;

    public LruCacheImplementation(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.dummyHead = new Node(-1, -1);
        this.dummyTail = new Node(-1, -1);
        this.dummyHead.next = dummyTail;
        this.dummyTail.prev = dummyHead;
    }

    private void addToFront(Node node) {
        node.next = dummyHead.next;
        node.prev = dummyHead;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }

    private void removeFromList(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            removeFromList(node);
            addToFront(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            removeFromList(node);
            addToFront(node);
        } else {
            if (cache.size() == capacity) {
                Node lastNode = dummyTail.prev;
                removeFromList(lastNode);
                cache.remove(lastNode.key);
            }

            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToFront(newNode);
        }
    }
}
