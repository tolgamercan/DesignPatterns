package org.example;

public class samsungFactory implements IAbstactFactory{
    @Override
    public IPhone cretatePhone() {
        System.out.println("samsung phone created");
        return null;
    }

    @Override
    public IComputer createComputer() {
        System.out.println("samsung computer created");
        return null;
    }
}
