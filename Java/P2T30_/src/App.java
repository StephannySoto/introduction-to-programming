//AUTHOR: CAMILO TALERO, AND STEPHANNY SOTO
//DATE:02/11/2020
//DESCRIPTION:

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();

    }
    public static void f_introduction(){
        //description show inicial menu/information of program
        System.out.println("------------------------------------------------------------------!");
        System.out.println( "-----------------------------------------------------------------!");
        System.out.println("-------------SofVECTORY-------------------------------------------!");
        System.out.println(".......version 1.0 camilo talero and stephanny soto  Nov 02--------");
        System.out.println("----------make by Ferney Camilo Talero  and stephanny soto--------!");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------!");

    }

    public static int f_total_numbers(){
        //description: this return the total product between 1 and 10000
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the total numbers do you need");
        int v_total_numbers =keyboard.nextInt();
        while(v_total_numbers<1 || v_total_numbers>50){
            System.out.println("Err the value should be beetween 1 to input again ");
            v_total_numbers=keyboard.nextInt();
        }
        return v_total_numbers;
    }

    
    public static int[] f_fill_vector_products(int N_products){
        //description:this mthod returns a vector with price N products
        int[] v_vector = new int[N_products];

        for (int i=0; i<N_products; i++){
            //(math random()* (v_max . v_min))
            v_vector[i]= (Math.random()*(98000))+1000
        }

    }
        
}
