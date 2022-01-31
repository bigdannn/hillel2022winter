package com.hillel.lesson_11.hw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ObjectCollectionImpl implements ObjectCollection {
    private Person[] personArray;   // Object <- any class
    private int sizeCount; // 0 : Integer - null
    Scanner sc = new Scanner(System.in); // todo: remove

    public ObjectCollectionImpl() {
        personArray = new Person[0]; // min size
        sizeCount = 0;
    }

    public ObjectCollectionImpl(int size) {
        personArray = new Person[size];
        sizeCount = 0;
    }

    @Override
    public void show() {
        for (Object o : personArray) {
            System.out.println(o);
        }
    }

    @Override
    public boolean add(Object o) {

        // add(count++, o);
        Person person = (Person) o; // Object
        if (sizeCount == personArray.length - 1) { // -1
            this.personArray = Arrays.copyOf(this.personArray, (this.personArray.length * 3) / 2 + 1);
            this.personArray[sizeCount] = person; // sizeCount++
            sizeCount++;
        } else {
            this.personArray[sizeCount] = person; // sizeCount++
            sizeCount++;
        }
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        Person person = (Person) o; // Object
        if (index > this.sizeCount)
            this.add(person); // sizeCount = 5; index = 8;
        else {
            this.personArray = Arrays.copyOf(this.personArray, this.personArray.length);
            for (int i = this.personArray.length - 1; i > index; i--) {
                this.personArray[i] = this.personArray[i - 1];
            }
            this.personArray[index] = person;
            sizeCount++;
        }
        return true;
    }

    @Override
    public boolean delete(Object o) {
        Person person = (Person) o;
        int index = 0;
        for (int i = 0; i < this.personArray.length - 1; i++) {
            if (personArray[i] == person) {
                index = i;
            }
        }
        for (int i = index; i < this.personArray.length - 1; i++) {
            this.personArray[i] = this.personArray[i + 1];
        }
        this.personArray = Arrays.copyOf(this.personArray, this.personArray.length);
        personArray[--sizeCount] = null;
        return true;
    }

    @Override
    public Object get(int index) {
        if (index > this.sizeCount)
            throw new ArrayIndexOutOfBoundsException();
        return this.personArray[index];
    }

    @Override
    public boolean contain(Object o) { // false -> == -> equals
        for (Person person : this.personArray) {
            if (person.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        return false;
    }

    public boolean equals(Object str) { //false
//        if (this == str)
//            return true;
//        return false;
        if (!(str instanceof ObjectCollection)) return false;
        ObjectCollection oc = (ObjectCollection) str;
        if (this == str) return  true;
        if (this.sizeCount != oc.size()) return false;

        // todo сравнение по элементно коллекции

        return false;
    }

    @Override
    public boolean clear() {
        this.personArray = new Person[0];
        sizeCount = 0;
        return true;
    }

    @Override
    public int size() {
        return this.personArray.length; // sizeCount
    }
}
