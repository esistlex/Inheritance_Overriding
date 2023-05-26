public class Plane extends Vehicle {
    public Plane(String name, String color, int speed, String property, double price){
        super (name, color, speed, property, price);
    }

    public void FLY(){
        System.out.println();
        System.out.println("Name: "+ this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed +"km/H");
        System.out.println("Property: " + this.property);
        System.out.println("Whooooooosh!");
    }
}