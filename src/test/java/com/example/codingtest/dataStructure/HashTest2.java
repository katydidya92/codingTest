package com.example.codingtest.dataStructure;

public class HashTest2 {

    public Slot[] hashTable;

    public HashTest2(Integer size) {
        this.hashTable = new HashTest2.Slot[size];
    }

    public class Slot {
        String key;
        String value;
        Slot next;

        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTest2 hashTest = new HashTest2(20);
        hashTest.saveData("DaveLee", "908901");
        hashTest.saveData("fun-coding", "9423408901");
        System.out.println(hashTest.getData("fun-coding"));
        System.out.println(hashTest.getData("DaveLee"));
    }
}
