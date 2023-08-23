package org.example;

public class wagCar implements Cloneable{
    private String carSubBrand;
    private int carEngineSize;
    private String engineType;
    private int transmissionType;
    private int price;

    public wagCar(int carEngineSize, String engineType, int transmissionType){
        this.carEngineSize=carEngineSize;
        this.engineType=engineType;
        this.transmissionType=transmissionType;
    }

    public String getCarSubBrand() {
        return carSubBrand;
    }

    public void setCarSubBrand(String carSubBrand) {
        this.carSubBrand = carSubBrand;
    }

    public int getCarEngineSize() {
        return carEngineSize;
    }

    public void setCarEngineSize(int carEngineSize) {
        this.carEngineSize = carEngineSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(int transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public wagCar clone(){
        wagCar car=null;
        try{
            car=(wagCar) super.clone();
        }catch (CloneNotSupportedException e){

        }
        return car;
    }

    @Override
    public String toString() {
        return "wagCar{" +
                "carSubBrand='" + carSubBrand + '\'' +
                ", carEngineSize=" + carEngineSize +
                ", engineType='" + engineType + '\'' +
                ", transmissionType=" + transmissionType +
                ", price=" + price +
                '}';
    }
}
