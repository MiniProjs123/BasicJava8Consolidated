package com.rev.BasicJava8.j8misc;

import com.rev.BasicJava8.constructorinject.ExampleConstructionInjection;
import com.rev.BasicJava8.immutable.ImmutablePlay;
import com.rev.BasicJava8.interfaces.InterfacesPlay;
import com.rev.BasicJava8.interfaces.MyDefaultInterfaceIllustrator;
import com.rev.BasicJava8.methodrefs.MyMethodReferenceMachine;
import org.springframework.stereotype.Component;

@Component
public class Java8misc {

    public ExampleConstructionInjection myConstructorInjection;

    public Java8misc(ExampleConstructionInjection myConstructorInjection) {
        this.myConstructorInjection = myConstructorInjection;
        initBasicJava8();
    }

    private void initBasicJava8() {
        System.out.println("\ninitiating BasicJava8....");

        // java 8 constructs
        new BasicStreamOps();
        new CopyByValue();
        new DateTimeApi();

        // map iterations
        new MapLooper();

        // interfaces
        new MyDefaultInterfaceIllustrator();
        new InterfacesPlay();

        new StringJoinerPlus();

        new ImmutablePlay();

        new ConcurrentModificationBlues();

        new MyMethodReferenceMachine();

        myConstructorInjection.printManagerSpiel();
    }

}


