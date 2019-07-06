import java.util.Scanner;
public class Mysearch {
    // The following is the main, contains the array and the input for a number to search.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number you want to search for in your array: ");
        int num = input.nextInt();
        int [] mysearch = {1,2,5,6,3,4,77,8,9,11,10,-8};
        mySearch(mysearch,num);
    }
    // The following is a method, outputs the result
    public static void mySearch(int [] mysearch,int num) {
        int ch = mysearch.length - 1;
        for (int i = 0;i < mysearch.length; i++) {
            if (mysearch[i] == num){
            System.out.print(num);
            System.out.print(" was found in the Array");
            }else{
            ch = ch - 1;
            }
        }
        if (ch == -1) {
            System.out.print("Number not found in Array");
        }
    }
}
