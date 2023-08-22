package org.example;

public class Main {
    public static void main(String[] args) {
        IAbstactFactory appleFactory=new appleFactory();
        IAbstactFactory samsungFactory =new samsungFactory();

        IPhone apple=appleFactory.cretatePhone();
        IPhone samsung=samsungFactory.cretatePhone();
    }
}