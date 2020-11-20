//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-oct-08
//DESCRIPTION: This program calculate the biketime between two cities

import java.util.Scanner;

public class App {
 public static void main(String[] args) throws Exception {
        System.out.println("===============================================");
        System.out.println("P2T9: Bike time. make by Stephanny Soto");
        System.out.println("TIMESOFT VERSION 1.0");
        System.out.println("===============================================");

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Input the distance between two cities. (Km)");
        double DISTANCE = keyboard.nextDouble();

        if (DISTANCE <= 0){
            System.out.println("ERR: The distance should be greater that zero.");
        }else{
             f_bike_time(DISTANCE);
        }
    }

public static void f_bike_time(double distance){
    //DESCRIPTION: This function/sub-program calculate
    Scanner keyboard1 = new Scanner (System.in);

    System.out.println("Input the constant velocity (KM/H)");
        double VELOCITY = keyboard1.nextDouble();
        if (VELOCITY<=0){
            System.out.println("ERR: The velocity should be greater that zero.");
        }else{
            double TIME= distance/VELOCITY;
            System.out.println("the time is "+ TIME+ "hours");
        }

    }
}
