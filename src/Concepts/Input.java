package Concepts;
import java.util.Scanner;


public class Input {
    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("MY name is ");
    String name = scanner.nextLine();

   System.out.print("My age is ");
   int age = scanner.nextInt();

   System.out.print("MY cgpa is: ");
   double cgpa = scanner.nextDouble();

   System.out.println(" R U A STUDENT {TRUE/FALSE}" );
   boolean isStudent = scanner.nextBoolean();




   System.out.println("HELLO " + name);
   System.out.println("U ARE " + age + "years old");
   System.out.println("GOOD!!  UR CGPA IS " + cgpa);
   System.out.println("u r student :" + isStudent);





    }

}

