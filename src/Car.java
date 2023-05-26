public class Car extends Vehicle {
    public Car(String name, String color, int speed, String property, double price) {
        super (name, color, speed, property, price);
    }

    public void DRIVE() {
        System.out.println("Name: "+ this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed +"km/H");
        System.out.println("Property: " + this.property);
        System.out.println("Vroom! Vroom!");
    }
}