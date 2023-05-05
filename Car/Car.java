package Car;

public class Car {
    public String model;
    public int currentVelocity = 0;
    public int maxVelocity;

    public Car(String model, int maxVelocity) {
        this.model = model;
        this.maxVelocity = maxVelocity;
    }

    public void speedUp(int acceleration) {
        if(this.currentVelocity + acceleration <= maxVelocity){
        this.currentVelocity += acceleration;
        } else {
        this.currentVelocity = this.maxVelocity;
        }
    }
    
    public void breakCar(int slowDown) {
        if(this.currentVelocity - slowDown >= 0) {
            this.currentVelocity -= slowDown;
        }else {
            this.currentVelocity = 0;
        }
    }
    
    public void turnOff() {
        this.currentVelocity = 0;
    }
}
