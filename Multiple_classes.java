public class Multiple_classes {
    public static void main(String[] args) {
        Second myCar = new Second();
        myCar.fast();
    }
}

class Second {
    public void fast() {
        System.out.println("The car is going as fast as it can!");
        speed(200);
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
