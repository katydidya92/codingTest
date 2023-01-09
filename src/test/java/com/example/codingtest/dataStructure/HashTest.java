package com.example.codingtest.dataStructure;

import org.junit.jupiter.api.Test;

public class HashTest {

    public Slot[] hashTable;

    public HashTest(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    @Test
    void hashTest() {
        Slot[] hashTable = new Slot[20];
        hashTable[0] = new Slot("test");
        System.out.println(hashTable[0]);
        System.out.println(hashTable[0].value);
    }

    public Integer hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public void saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTest hashTest = new HashTest(20);
        hashTest.saveData("DaveLee", "908901");
        hashTest.saveData("fun-coding", "9423408901");
        System.out.println(hashTest.getData("fun-coding"));
        System.out.println(hashTest.getData("DaveLee"));
    }
}
