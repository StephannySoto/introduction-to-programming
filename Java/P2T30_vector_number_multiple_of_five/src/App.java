//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-nov-03
//DESCRIPTION: This program calculate the biketime between two cities

// P2:importar las librerias requeridas 

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_total_numbers = f_total_numbers();
        int v_vector_number [] = f_fill_vector_numbers(v_total_numbers);
        
        for (int i=0; i<v_total_numbers; i++){
            if( v_vector_number[i] % 5 == 0){
                System.out.println(v_vector_number[i]);
            }
        }
}

public static void f_introduction(){
    //description: show inicial menu/information of program
    System.out.println("-----------------------------------------");
    System.out.println("------------soft------------");
    System.out.println("----------version 1.0 2020-nov-03---------");
    System.out.println("----------make by Stephanny Soto----------");
    System.out.println("------------------------------------------");

}

public static int f_total_numbers(){
    //description: this return the total product between 1 and 10000
    Scanner keyboard = new Scanner(System.in);
    System.out.println("imput the total numbers do you need");
    int v_total_numbers =keyboard.nextInt();
    while(v_total_numbers<1 || v_total_numbers>100){
        System.out.println("Err the value should be beetween 1 to input again ");
        v_total_numbers=keyboard.nextInt();
    }
    return v_total_numbers;
}

public static int[] f_fill_vector_numbers(int v_total_numbers){
    //description:this mthod returns a vector with price N products
    int [] v_vector = new int [v_total_numbers];

    for (int i=0; i<v_total_numbers; i++){
        //(math random()* (v_max . v_min))
        v_vector[i]= (int) (Math.random()*(50))+1;

    }
    return v_vector;

}  

}
