import java.util.Scanner;

public class HW74_GCDjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int x = input.nextInt();
        System.out.print("Enter second value: ");
        int y = input.nextInt();
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;


            }



        }
        System.out.println(gcd);

    }
}
