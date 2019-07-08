
import java.util.Scanner;

public class HW0708 {
    //A method
    public static int [] A(int len ) {
        Scanner input = new Scanner(System.in);
        int [] A = new int[len];
        System.out.print("Input A array: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        return A;
    }

    //B method
    public static int [] B(int len ) {
        Scanner input = new Scanner(System.in);
        int [] B = new int[len];
        System.out.print("Input B array: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }
        return B;
    }
    //C method
    public static int [] sum_lists(int [] A,int [] B,int len) {
        Scanner input = new Scanner(System.in);
        int absum = 0;
        int [] C  = new int[len];
        for (int i = 0; i < B.length && i < A.length; i++) {
           absum = A[i] + B[i];
           C[i] = absum;
            System.out.print(C[i]+" ");
        }
        System.out.println(" ");
        return C;
    }
    //D method
    public static int [] D(int [] C, int len ) {
        Scanner input = new Scanner(System.in);
        int [] D = new int[len];
        for (int i = 0; i < D.length; i++) {
            D[i] = C[i] * 10;
            System.out.print(D[i]+" ");
        }
        return D;
    }
    // Main of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int len = input.nextInt();
        int [] A = HW0708.A(len);
        int [] B = HW0708.B(len);
        int [] C = HW0708.sum_lists(A,B,len);
        int [] D = HW0708.D(C,len);
    }
}
