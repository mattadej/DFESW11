package org.qa.dependencyinversionsolid.devs;

import org.qa.dependencyinversionsolid.interfaces.Developer;

public class BackendDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("Java is the best");
    }
}
