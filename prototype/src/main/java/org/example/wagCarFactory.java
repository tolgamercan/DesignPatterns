package org.example;

public class wagCarFactory implements factory{
    private static wagCar baseCar=new wagCar(1,"deisel",1);

    @Override
    public wagCar createSeatLeon() {
        wagCar leon=baseCar.clone();
        leon.setCarSubBrand("seat");
        leon.setPrice(1000);
        return leon;
    }

    @Override
    public wagCar createVwGolf() {
        wagCar golf=baseCar.clone();
        golf.setCarSubBrand("vw");
        golf.setPrice(1200);
        return golf;
    }

    @Override
    public wagCar createAudiA3() {
        wagCar a3=baseCar.clone();
        a3.setCarSubBrand("audi");
        a3.setPrice(1500);
        return a3;
    }
}
