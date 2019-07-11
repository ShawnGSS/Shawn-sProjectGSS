import java.util.Scanner;
public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    Triangle() {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }
    Triangle(int side1,int side2,int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean confirm(int side1,int side2,int side3) {
        if (side1 + side2 > side3) {
            return true;
        } else if (side1 + side3 > side2) {
            return true;
        } else if (side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }
    public int perimeter(int side1,int side2,int side3) {
        int perim = side1 + side2 + side3;
        return perim;
    }
    //Still have to fix compare
   // public boolean compare(Object o) {
    //    if (this.side1 == this.) {
    //    return true;
    //    }
    //    else {
    //    return false;
    //    }
    //    }


    public void setSide1(int s1) {this.side1 = s1;}
    public void setSide2(int s2) {this.side2 = s2;}
    public void setSide4(int s3) {this.side3 = s3;}
    public int getSide1() { return side1; }
    public int getSide2() { return side2; }
    public int getSide3() { return side3; }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Triangle tri1= new Triangle(1,2,3);
        Triangle tri2= new Triangle(2,2,3);
      //  System.out.print(tri1.compare(tri2));

    }
}

