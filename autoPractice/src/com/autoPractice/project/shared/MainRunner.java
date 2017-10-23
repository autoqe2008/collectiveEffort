package com.autoPractice.project.shared;

import cucumber.api.cli.Main;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;

public class MainRunner {

    public static final WebDriver driver = null;
    static Logger log = Logger.getLogger(MainRunner.class);

    public static void main (String Args[])throws InterruptedException, IOException {
        MainRunner mn = new MainRunner();
        BasicConfigurator.configure();
        ArrayList<String> ae = mn.getScenarios();
        ae.add("--glue");
        ae.add("com.autoPractice.project.stepDef");
        log.info("Added Glues to Identify step definitions");
        Main.run(ae.toArray(new String[mn.getScenarios().size()]),Thread.currentThread().getContextClassLoader());
        log.info("Started Executing scenarios");
    }

    public static ArrayList getProperties()
    {
        ArrayList properties =  new ArrayList();
        properties.add(System.getenv("browser"));
        properties.add(System.getenv("website"));
        properties.add(System.getenv("tags"));
        properties.add(System.getenv("scenarios"));
        return properties;
    }

    private ArrayList<String> getScenarios()
    {
        ArrayList<String> ae = new ArrayList();
        String scenarios = getProperties().get(3).toString();
        ae.add(scenarios);
        log.info("scenarios are :" + scenarios);
        String tags = getProperties().get(3).toString();
        log.info("Tags are :" + tags);
        return ae;
    }

}
