/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class TP02Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alexandre Zampieri Salles | Caio Andrade
        //1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. 
        //Caso contrário solicitar novamente apenas o segundo valor.
        
               Scanner scanner = new Scanner(System.in);
               double v1, v2;
        
         System.out.print("Digite o primeiro valor: ");
         v1 = scanner.nextDouble();
         
        do{
        System.out.print("Digite o segundo valor: ");
         v2 = scanner.nextDouble();
                 }while(v1>v2);
        
        
      
    }
}
