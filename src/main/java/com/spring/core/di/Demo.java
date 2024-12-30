package com.spring.core.di;


class DependencyA {

}

class DependencyB {

}

class DependencyC {

}

public class Demo {
    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;

    public Demo(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
        this.dependencyC = dependencyC;
    }
}
