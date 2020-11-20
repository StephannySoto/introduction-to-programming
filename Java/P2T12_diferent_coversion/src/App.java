//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-oct-13
//DESCRIPTION: This program calculate the conversion of grades

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T12: Diferent conversion. Maker by Stephanny Soto");
        System.out.println("GRADESOFT VERSION 1.0");

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Input the grade to convert");
        double GRADE1 = keyboard.nextDouble();

        System.out.println("Input the grade in which you want convert");
        double GRADE2 = keyboard.nextDouble();
        

    public static void f_convesion(double C_to_F)¨{

        System.out.println("Input the grade to convert");
        double GRADE1 = keyboard.nextDouble();
        
        if(GRADE1>=0){
            System.out.println("ERR: The grade should be greater that zero.");
        }else{
            double F= (GRADE1*1.8)+32;
        }

    }
    public static void f_convesion(double F_to_C)¨{

        System.out.println("Input the grade to convert");
        double GRADE1 = keyboard.nextDouble();
        
        if(GRADE1>=0){
            System.out.println("ERR: The grade should be greater that zero.");
        }else{
            double F= (GRADE1*1.8)+32;
        
    }
}
