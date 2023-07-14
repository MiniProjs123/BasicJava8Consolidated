package com.rev.BasicJava8.constructorinject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleConstructionInjection {

    /* TWO ADVANTAGES OF USING CONSTRUCTOR INJECTION

        1) Methods cannot be invoked until the dependencies are loaded, so there are no NullPointers caused
           by timing issues, trying to call something before it is initialized
        2) When testing, the class can be tested can be done without creating an actual object instance.
           Just create the class with (maybe another) constructor and mock the arguments with Mockito.
     */

    private static final Logger logger = LoggerFactory.getLogger(ManagerDoOther.class);
    private ManagerMaker1 managerMaker;

    private ManagerDoOther managerOther;


    public ExampleConstructionInjection(ManagerMaker1 managerMaker) {
        this.managerMaker = managerMaker;
    }

    @Autowired // only required when more than 1 constructor is supplied
    public ExampleConstructionInjection(ManagerMaker1 managerMaker, ManagerDoOther managerOther) {
        this.managerMaker = managerMaker;
        this.managerOther = managerOther;
    }

    public void printManagerSpiel() {
        logger.info("**** about to demonstrate constructor injection......");
        managerMaker.doSomething1();
        managerOther.doSomething2();
    }


}
