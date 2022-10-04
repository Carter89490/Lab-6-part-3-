import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double diagonal = 0;
        double lenghtTwo = 0;
        double widthTwo = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the length of the triangle: ");
        if(in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the length was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        System.out.print("Enter the width of the triangle: ");
        if(in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the width was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        lenghtTwo = length * length;
        widthTwo = width * width;
        total = lenghtTwo + widthTwo;
        diagonal = Math.sqrt(total);
        System.out.println("the hypotenuse is: " + diagonal);


    }
}