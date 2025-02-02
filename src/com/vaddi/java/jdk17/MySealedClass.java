package com.vaddi.java.jdk17;

public sealed class MySealedClass permits A , B{

    public String getMessage() {
        return "Hello Sealed Class ";
    }
}
