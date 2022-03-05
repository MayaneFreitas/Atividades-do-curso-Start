
package Estruturarepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        
       Scanner leitorScanner = new Scanner(System.in);
       
       char Continuar = 'S';
       
       while(Continuar == 'S'|| Continuar == 'S'){
           
           System.out.println("Digite um numero:");
           int numero = leitorScanner.nextInt();
           
           if (numero == 0 ){
               System.out.println("o numero digitado é zero");
               
           }else {
               
               if (numero > 0 ){
                   System.out.println("O numero é  POSITIVO");
                   
               } else { 
                   System.out.println("O numero é NEGATIVO");
               }        
       }
        System.out.println("Deseja comtinuar?  S - Sim / N - Não");
        
        Continuar = leitorScanner.next().charAt(0);
        
    }
    }
}
