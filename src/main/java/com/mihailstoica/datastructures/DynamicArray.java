package com.mihailstoica.datastructures;

public class DynamicArray {

    private Object[] data;

    // Counter for the number of elements in our array
    private int size = 0;

    // The capacity of our array - or how many elements it can hold
    // When the number of elements exceeds the capacity of the array, we double
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, Object value) {
        data[index] = value;
    }

    public void insert(int index, Object value) {

        // Check size
        if (size == initialCapacity) {
            resize();
        }

        // Copy up
        for (int j = size; j > index; j--) {
            data[j] = data[j-1];
        }

        // Insert
        data[index] = value;
        size++;
    }

    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i=0;i< size;i++) {
            System.out.println("data[i] = " + data[i]);
        }
    }

    // Some array implementations offer methods like insert (also known as pushBack).
    // Which is like insert, only in does the insert at the end of the array.
    public void add(Object value) {

        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

    public void delete(int index) {
        // Copy down
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        // Clear last element of array
        if (index == size) {       // index is last element
            data[index] = null;
        } else {
            data[size - 1] = null; // index is not last element
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean Contains(Object value) {
        for (int i = 0; i <= size -  1; i++) {
            Object currentValue = data[i];
            if (currentValue.equals(value)) {
                return true;
            }
        }
        return false;
    }

}
