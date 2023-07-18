package vehicle;

public class Vehicle {

    private int currentSpeed;

    public Vehicle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int accelerate(){
        if (currentSpeed * 2 > 200){
            throw new ExcessiveSpeedException("Too fast!");
        }
        this.currentSpeed *= 2;
        return currentSpeed;
    }

}
