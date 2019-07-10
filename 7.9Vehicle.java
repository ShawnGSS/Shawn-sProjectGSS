public class Vehicles{
    String carColour;
    String carBrand;
    String carDoor;
    public void setBrand(String brand){carBrand = brand;}
    public void setColour(String colour) {carColour = colour;}
    public void setDoor(String door) {carDoor = door;}
    public String getBrand() { return carBrand;}
    public String getColour() { return carColour;}
    public String getDoor() {return carDoor;}
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
