package Concepts;

public class LogicOperators {
    public static void main(String[] args){

        double temp =-20;
        boolean isSunny = false;

        if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY");
        }

        else if(temp <= 30 && temp>=0 && !isSunny){
            System.out.println("The Weather is GOOD");
            System.out.println("It is CLOUDY");
        }

        else if(temp>30 || temp<0){
            System.out.println("Weather is EXTREME !!!");
        }

    }
}
