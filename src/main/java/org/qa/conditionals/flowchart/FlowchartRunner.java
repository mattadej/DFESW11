package org.qa.conditionals.flowchart;

public class FlowchartRunner {

    public static void main(String[] args) {

        Flowchart flowchart = new Flowchart();

        System.out.println(flowchart.methodOne(5, 5, true));
        System.out.println(flowchart.methodOne(5, 5, false));
    }

}

