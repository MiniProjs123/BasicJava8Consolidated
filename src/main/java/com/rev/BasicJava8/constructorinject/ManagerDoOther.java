package com.rev.BasicJava8.constructorinject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagerDoOther {

    private static final Logger logger = LoggerFactory.getLogger(ManagerDoOther.class);
    private char code;
    private double output;

    @Autowired
    public ManagerDoOther() {

    }

    public ManagerDoOther(char code, double output) {
        this.code = code;
        this.output = output;
    }

    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public void doSomething2() {
        logger.info("Manager do something 2");
    }

}
