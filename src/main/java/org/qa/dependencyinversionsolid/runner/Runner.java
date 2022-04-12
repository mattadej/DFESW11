package org.qa.dependencyinversionsolid.runner;

import org.qa.dependencyinversionsolid.devs.BackendDeveloper;
import org.qa.dependencyinversionsolid.devs.FrontendDeveloper;
import org.qa.dependencyinversionsolid.interfaces.Developer;
import org.qa.dependencyinversionsolid.project.Project;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        //single dev
        BackendDeveloper backend = new BackendDeveloper();
        FrontendDeveloper frontend = new FrontendDeveloper();
        Project project = new Project();

        project.implementOneDev(frontend);
        project.implementOneDev(backend);

        System.out.println("\n=======================================================\n");

        List<Developer> devs = new ArrayList<>();
        devs.add(frontend);
        devs.add(backend);

        //List of developers version 1
        Project multiDevs = new Project(devs);
        multiDevs.implementListOne();

        System.out.println("\n=======================================================\n");

        //List of developers version 2
        Project devList = new Project();
        devList.implementListTwo(devs);
    }
}
