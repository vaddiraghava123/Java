package com.vaddi.java.createImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class CreateImmutableClass {

    public static void main(String[] args) {
        createImmutableClassUsingFinal();
    }

    public static void createImmutableClassUsingFinal() {
        createFinalClassToSolveImmutable createFinalClassToSolveImmutable;
    }

    /**
     * Declare class as final
     * Not required  setter()
     * Need to create a new object for list of Items
     * Not required static
     */
    public static final class createFinalClassToSolveImmutable {

        private final int id;
        private final int name;
        private final List<String> items;

        public createFinalClassToSolveImmutable(int id, int name, List<String> items) {
            this.id = id;
            this.name = name;
            //For list -
            this.items = new ArrayList<>();
            for(String item : items) {
                items.add(item);
            }
        }

        public int getId() {
            return id;
        }
        public int getName() {
            return name;
        }
        public List<String> getItems() {
            //Create a new arrayList
            List<String> newList = new ArrayList<>();
            for(String item : items)
            newList.add(item);
            return newList;
        }
    }
}
