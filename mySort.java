import java.util.Arrays;
import java.util.Scanner;

public class mySort {
    // The following is the main, containing the array.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] Myarray = {1,2,5,6,3,4,77,8,9,11,10,-8};
        mySort(Myarray);
    }
    // The following is the method, to sort an array
    public static void mySort(int [] Myarray) {
        int temp = 0;
        for (int i = 0; i < Myarray.length - 1; i++) {
            if (Myarray[i] > Myarray[i + 1]) {
                temp = Myarray[i];
                Myarray[i] = Myarray[i + 1];
                Myarray[i + 1] = temp;
                i =  0;
            }
        }
        System.out.print(Arrays.toString(Myarray));
    }
    }

