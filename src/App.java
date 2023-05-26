public class App {
    public static void main(String[] args) throws Exception {

        Car Toyota_VIOS = new Car("Toyota VIOS", "Red", 170, "All-season tires type", 1005000.00);
        Toyota_VIOS.DRIVE();

        Plane U2_Spy_PlaNe = new Plane("Lockheed U-2", "Black", 805, "31 meters wing span", 712406250.00);
        U2_Spy_PlaNe.FLY();

        Boat Fandango_Yacht = new Boat("Fandango Yacht", "White", 18, "White-colored main sail", 12782465239.50);
        Fandango_Yacht.FLOAT();

        System.out.println();
        Toyota_VIOS.STOP();
        System.out.println();
        U2_Spy_PlaNe.STOP();
        System.out.println();
        Fandango_Yacht.STOP();

    }
}
