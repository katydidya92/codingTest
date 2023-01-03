package com.example.codingtest.dataStructure;

import org.junit.jupiter.api.Test;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    @Test
    void addNodeTest() {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);

        myList.printAll();
    }

    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    @Test
    void addNodeInsideTest() {
        SingleLinkedList<Integer> myList2 = new SingleLinkedList<>();
        myList2.addNode(4);
        myList2.addNode(5);
        myList2.addNode(6);

        myList2.printAll();

        System.out.println("===================");
        myList2.addNodeInside(8, 4);
        myList2.printAll();

        System.out.println("===================");
        myList2.addNodeInside(8, 7);
        myList2.printAll();
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    @Test
    void delNodeTest() {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);

        myList.printAll();
        System.out.println("===================");
        myList.delNode(3);
        myList.printAll();
    }


}
