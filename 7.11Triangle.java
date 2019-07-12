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
    public boolean confirm() {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }
    public int perimeter() {
        int perim = side1 + side2 + side3;
        System.out.print(perim);
        return perim;
    }
    public boolean compare(Triangle o) {
        boolean m = false;
        int[]t1=this.getSortedTriangle();
        int[]t2=o.getSortedTriangle();
        for(int i = 0; i<3; i++){
            if (t1[i]!=t2[i]){
                return false;
            }
        }
        return true;
    }
    public int[] getSortedTriangle() {
        int temp = 0;
        int[] triarray = {side1, side2, side3};
        for (int i = 0; i < 2; i++) {
            if (triarray[i] > triarray[i + 1]) {
                temp = triarray[i];
                triarray[i] = triarray[i + 1];
                triarray[i + 1] = temp;
                i = 0;
            }
        }
        return triarray;
    }

    public void setSide1(int s1) {this.side1 = s1;}
    public void setSide2(int s2) {this.side2 = s2;}
    public void setSide4(int s3) {this.side3 = s3;}
    public int getSide1() { return side1; }
    public int getSide2() { return side2; }
    public int getSide3() { return side3; }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Triangle tri1= new Triangle(2,3,2);
        Triangle tri2= new Triangle(2,2,3);
        System.out.println(tri1.compare(tri2));
        System.out.println(tri1.confirm());
        System.out.println(tri1.perimeter());

    }
}
