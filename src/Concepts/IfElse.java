package Concepts;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.println("Enter ur age : ");
        age = scanner.nextInt();

        if(age > 24){
            System.out.println("U are adult !!!!");
        }

        else{
            System.out.println("U are not ADULT !!!");
        }
    }
}
