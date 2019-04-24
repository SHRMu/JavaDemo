package Model;

import Reflection_Demo.Subject;

public class Person implements Subject {
    @Override
    public void shopping() {
        System.out.println("shopping successfully");
    }
}
