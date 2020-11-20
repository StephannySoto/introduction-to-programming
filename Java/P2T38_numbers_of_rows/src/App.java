//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-nov-17
//DESCRIPTION: Fill a two-dimensional array of N x M (values that the user must enter by keyboard),
// with random numbers between 1 and 1000.
//Then the software will ask the user to enter a value between 1 to N (number of rows) and the software will display the sum, average, 
//When the user enters a value equal to zero (0) it must be finished. 

// P2:importar las librerias requeridas
import.java.util.Scanner


public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int v_total_town  = f_total_town();
    int v_total_days = f_total_days();

    int [][] v_matriz_survey= f_fill_matriz_survey(v_total_town);
   

    


}

    }

    // p3: crear el metodo de f_introduction() <--- nos muestra informacion inicial del soft
public static void f_introduction(){
    //description: show inicial menu/information of program
    System.out.println("-----------------------------------------");
    System.out.println("------------soft------------");
    System.out.println("----------version 1.0 2020-nov-17---------");
    System.out.println("----------make by Stephanny Soto----------");
    System.out.println("------------------------------------------");

}
        
    
    }
    ///p4.1 how many town there are
    public static int f_total_town(){
        //description: this method returns the 
        Scanner keyboard = new Scanner ( System.in);
        System.out.println("how many tonw there are");
        int v_total_town= keyboard.nextInt();
        while (v_total_town<1 || v_total_town>1000){
            System.out.println("how many town there are");
            v_total_town=keyboard.nextInt();


        }
        return v_total_town;
       
       
        ///p4.1 how many days are
    public static int f_total_day(){
        //description: this method returns the total of days
        Scanner keyboard = new Scanner ( System.in);
        System.out.println("how many days");
        int v_total_days= keyboard.nextInt();
        while (v_total_days<1 || v_total_days>1000){
            System.out.println("how many days");
            v_total_days=keyboard.nextInt();


        }
        return v_total_days;
    }

    //p4.2 make to 
    public static int [][]f_fill_matriz_survey(int v_total_town){
        //description: this method returns the matriz NxS with value beetwen 1 to 1000
        int[]v_matriz_survey = new int[v_total_town][v_total_days];
        for(int i=0;i<v_user_town;i++){
            v_matriz_survey[i][j]= (int) (math.ramdom()*1000)+1;

        }
        return v_matriz_survey;
    
    public static void f_show_matriz_value(); {
        //
        for(int i=0; i<v_matriz_survey.length;1++);
    }
        
    }


}

}