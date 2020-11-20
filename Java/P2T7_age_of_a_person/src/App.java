//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-oct-06
//DESCRIPTION: This program show the age of a person
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===============================================");
        System.out.println("|P2T7: Age of a person. make by Stephanny Soto|");
        System.out.println("===============================================");
        
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Input you year of birth:");
        int YEAR = keyboard.nextInt();

        if(YEAR>=2020){
            System.err.println("ERR: This year can't process, you should input a year less that 2020");
        }else{
            int AGE= 2020-YEAR;
            if(AGE>18){
                System.out.println(" she/he is a adult");
            }else{
                System.out.println(" she/he is a boy/girl");
            }
        }
    }
}