//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-oct-26
//DESCRIPTION: This program calculate 

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
       double sum =0; 
       int n_product=0;
       System.out.println("Imput the valor of the product:");
       int valor= keyboard.nextInt();
       while(sum<=500000){
          sum=sum+valor;
          n_product=n_product+1;
          System.out.println("Imput the valor of other product:");
          valor= keyboard.nextInt(); 
       }
       System.out.println("The number of products is: "+n_product+" and the total valor is: "+sum);
    }
}
