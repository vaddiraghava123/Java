package com.vaddi.java.comparableAndComparator;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    //By age
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(),o.getAge());
    }
}
