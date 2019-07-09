public class Vehicles{
    String carColour;
    String carBrand;
    String carDoor;
    public String setBrand(String brand) {
        carBrand = brand;
        return carBrand;
    }
    public String setColour(String colour) {
        carColour = colour;
        return carBrand;
    }
    public String setDoor(String door) {
        carDoor = door;
        return carBrand;
    }
    public String getBrand() {
        return carBrand;
    }
    public String getColour() {
        return carColour;
    }
    public String getDoor() {
        return carDoor;
    }
    public void print_vehicle() {
        System.out.println("Brand: " + carBrand);
        System.out.println("Colour: " + carColour);
        System.out.println("Amount of doors: " + carDoor);
    }
    public static void main(String []args) {
        Vehicles Auto1 = new Vehicles();
        /* Call class method to set puppy's age */
        Auto1.setBrand("Audi");
        Auto1.setColour("Black");
        Auto1.setDoor("2");
        /* Call another class method to get puppy's age */
        Auto1.getBrand();
        Auto1.getColour();
        Auto1.getDoor();
        Auto1.print_vehicle();
    }
}
