package Concepts;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       double width = 0;
       double height = 0;
        double area = 0;

        System.out.print("Enter width : ");
        width = scanner.nextDouble();

        System.out.print("Enter height : ");
        height = scanner.nextDouble();

        area = height * width;

        System.out.println("area = " + area);

    }
}
