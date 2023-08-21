package org.example;
public class Instance {
    private static Instance instance;

    public Instance(){
        System.out.println("Instance created");
    }
    public static Instance getInstance(){
        if(instance==null){
            synchronized (Instance.class){
                instance=new Instance();
            }
        }
        return instance;
    }
}
