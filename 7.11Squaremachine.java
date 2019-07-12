
public class Squaremachine {
    private double side;
    public void setSide(double s) { this.side = s;}
    double Area(){
        return side*side;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Squaremachine side1 = new Squaremachine();
        System.out.print("Enter square side: ");
        double si = input.nextDouble();
        side1.setSide(si);
        System.out.print(side1.Area());
        
    }
}
