package week3;

public class Car {
    private String model;
    private String brand;
    private int speed;

    public Car(String model, String brand, int speed) {
        this.model = model;
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        System.out.println("The car accelerates");
    }

    public void brake() {
        System.out.println("The car brakes");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Sandero", "Dacia", 150); // Create an object of class Car (This will call the constructor)

        System.out.println(myCar.model); // Print the value of model
        System.out.println(myCar.brand);
        System.out.println(myCar.speed);
        myCar.accelerate();
        myCar.brake();
    }
}


