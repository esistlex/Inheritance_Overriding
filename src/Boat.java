public class Boat extends Vehicle {
    public Boat(String name, String color, int speed, String property, double price){
        super (name, color, speed, property, price);
    }

    public void FLOAT(){
        System.out.println();
        System.out.println("Name: "+ this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed +" knots");
        System.out.println("Property: " + this.property);
        System.out.println("Hooooooooooooonk! Hooonk!");
    }
}