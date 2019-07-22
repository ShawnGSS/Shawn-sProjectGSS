public class SquareTester {
    public static void main(String []args){
        Square square = new Square(14);
        int x = square.getLength();
        System.out.println(square.toString(x,x));
        System.out.println(" ith a perimeter of: "+ (x + x) + " and an area of: " + x*x);

    }
}
