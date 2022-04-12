package org.qa.dependencyinversionsolid.project;

import org.qa.dependencyinversionsolid.interfaces.Developer;

import java.util.List;

public class Project {

    //Single developer
    private Developer developer;

    //List of developers
    private List<Developer> developers;

    //Default constructor
    public Project() {}

    //Single dev constructor
    public Project(Developer developer) {
        this.developer = developer;
    }

    //List dev constructor
    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    //Singular developer
    public void implementOneDev(Developer dev) {
        dev.develop();
    }

    //List of developers method 1 -
    public void implementListOne() {
        for(Developer dev : developers) {
            //implementOneDev(dev); 		-----Implements the single dev method, instead of repeating the logic again
            dev.develop();
        }
    }

    //List of developers method 2 ----- KEY DIFFERENCE: We create the list in the parameters instead of using the pre-existing list
    public void implementListTwo(List<Developer> devs) {
        for(Developer dev : devs) {
            //implementOneDev(dev);			-----Implements the single dev method, instead of repeating the logic again
            dev.develop();
        }
    }
}
