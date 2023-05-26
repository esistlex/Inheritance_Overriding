public class Vehicle {  
    int speed;
    String name, color, property;
    Double price;

    public Vehicle(String name, String color, int speed, String property, double price){
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.property = property;
        this.price = price;   
    }

    public void STOP(){
        System.out.println(this.name + " is STOPPING!");
    }
}