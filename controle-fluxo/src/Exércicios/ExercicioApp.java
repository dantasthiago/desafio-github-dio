package Exércicios;

import java.util.Scanner;

public class ExercicioApp {

  public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = 3; 
   
// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int contador = 0;

        for(int i = 0; i<=1000; i++ ){
          for(int j = 0; j<t; j++){
            if(contador < 1000){

              System.out.println("N[" + contador  + "] = " + j );
              contador++;
            }
            
          }
        }
          
          
                   
          leitor.close();  
        }
  
}

