//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-nov-05
//DESCRIPTION: This program calculate the biketime between two cities

// P2:importar las librerias requeridas 

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        f_introduction();

        int v_vector_number [] = f_fill_vector_numbers();
        int v_opportunity=1, v_user_number;
        Boolean v_win=false;

        do{
            System.out.println(v_opportunity+ "Input number between 1 and 10:");
            v_user_number= keyboard.nextInt();
            for(int i=0; i<10;i++){
                if(v_vector_number[i]==v_user_number){
                    v_win=true;
                }
            }
            v_opportunity=v_opportunity+1;

        }while(v_opportunity<=4 && v_win==false);

        if(v_win==false){
            System.out.println("you lost");
        }else{
            System.out.println("you win create a JAVA software that:  

            Ask the user to enter a word of at least 6 characters by keyboard, the software must convert that word into a string array, and then display each letter with its respective ASCII code on the screen.
            
            Construir un programa en JAVA que, 
            
            Pida al usuario ingresar por teclado una palabra de mínimo 6 caracteres, el software debe convertir esa palabra en un arreglo tipo string, y  luego visualizar en pantalla cada letra con su respectivo código ASCII.
            "); 
        }
    }  

public static void f_introduction(){
    //description: show inicial menu/information of program
    System.out.println("-----------------------------------------");
    System.out.println("------------soft------------");
    System.out.println("----------version 1.0 2020-nov-05---------");
    System.out.println("----------make by Stephanny Soto----------");
    System.out.println("------------------------------------------");

}
public static int[] f_fill_vector_numbers(){
    //description:this mthod returns a vector with price N products
    int [] v_vector = new int [10];

    for (int i=0; i<10; i++){
        //(math random()* (v_max . v_min))
        v_vector[i]= (int) (Math.random()*(9))+1;
        System.out.println( v_vector[i] );
    }
    return v_vector;
}
}
