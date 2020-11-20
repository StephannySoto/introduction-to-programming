//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-nov-09
//DESCRIPTION: Crear dos arreglos (vectores) con 100 posiciones (uno para mujeres y otro para hombres)
// en cada vector se guardara las edades que se generan de forma aletoria entre 1 y 100. 

// P2:importar las librerias requeridas

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int [] v_vector_men  = f_fill_vector_ages();
        int [] v_vector_women  = f_fill_vector_ages();
        int [] v_totales = {0,0,0,0,0};
        for(int i=0;i<v_vector_men.length;i++){
            if(v_vector_women[i]<18){
                v_totales[1]=v_totales[1]+1{
            }else if(v_vector_women[i]<60){
                v_totales[3]=v_totales[3]+1;
            }else{
                v_totales[5] = v_totales[5]+1;
            }
            v_totales[7]=v_totales[7]+v_vector_women[i];


            if(v_vector_men[i]<18){
                v_totales[1]=v_totales[1]+1{
            }else if(v_vector_men[i]<60){
                v_totales[2]=v_totales[2]+1;
            }else{
                v_totales[4] = v_totales[4]+1;
            }
            v_totales[6]=v_totales[6]+v_vector_men[i]

        }
    
}
// p3: crear el metodo de f_introduction() <--- nos muestra informacion inicial del soft
public static void f_introduction(){
    //description: show inicial menu/information of program
    System.out.println("-----------------------------------------");
    System.out.println("------------soft------------");
    System.out.println("----------version 1.0 2020-nov-09---------");
    System.out.println("----------make by Stephanny Soto----------");
    System.out.println("------------------------------------------");

}
public static int[] f_fill_vector_ages(){
    //description:
    int[] v_vector = new int[10];
    for (int i=0;i<10;i++){
        v_vector[i]=(int) (Math.random()*99)+1;
    }
    return v_vector;
}
System.out.println("men "+v_totales[0]+" and women "+v_totales[1]+ddd");
System.out.println("men " +v_totales[2]+ " and women "+v_totales[3]+"dvd");
System.out.println("men "+v_totales[4]+" and women "+v_totales[5]+"ddd");


}

