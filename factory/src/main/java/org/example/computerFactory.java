package org.example;

public class computerFactory {
    public static IComputer getComputer(int battery,int screenSize,String seriesCode){
        IComputer computer;
        if(seriesCode.equalsIgnoreCase("15")){
computer=new macbook15();
        } else if(seriesCode.equalsIgnoreCase("14")){
computer=new macbook14();
        }else{
            throw new RuntimeException("Not found");
        }
        return computer;
    }

}
