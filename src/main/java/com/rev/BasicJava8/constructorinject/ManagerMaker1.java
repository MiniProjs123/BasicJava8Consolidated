package com.rev.BasicJava8.constructorinject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ManagerMaker1 {

    private static final Logger logger = LoggerFactory.getLogger(ManagerMaker1.class);

    private String name;

    private int area;

    @Autowired
    public ManagerMaker1() {

    }

    public ManagerMaker1(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void doSomething1() {
        logger.info("Manager do something 1");
    }

}
