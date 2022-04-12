package org.qa.dependencyinversionsolid.devs;

import org.qa.dependencyinversionsolid.interfaces.Developer;

public class FrontendDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("Javascript is okay");
    }

}
