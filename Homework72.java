import java.util.Scanner;

public class Homework72 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your hours to convert to minutes and seconds: ");
        float t = input.nextFloat();
        float minutes = t * 60;
        float seconds = minutes * 60;

        System.out.println((int)Math.round(minutes) + " this is the minutes");
        System.out.println((int)Math.round(seconds) + " this is the seconds");



    }
}
