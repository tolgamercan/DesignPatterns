package org.example;

public class appleFactory implements IAbstactFactory{
    @Override
    public IPhone cretatePhone() {
        System.out.println("apple phone created");
        return null;
    }

    @Override
    public IComputer createComputer() {
        System.out.println("apple computer created");
        return null;
    }
}
