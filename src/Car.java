public class Car {
    String brand;

    public Car(String brand, int horsePower, boolean isAVD, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAVD = isAVD;
        this.acceleration = acceleration;
    }

    Car() {
        this("Mazda",190,false,10);
    }

    int horsePower;
    boolean isAVD;
    float acceleration;
    void  start(){
        System.out.println(brand+" has been start");
    }
    void setAcceleration(float acceleration){
        this.acceleration=acceleration;
    }
    float countSpeed(float time){
        return (100/acceleration)*time;
    }
}
