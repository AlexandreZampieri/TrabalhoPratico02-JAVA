/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex2;
import java.util.Scanner;
/**
 *
 * @author cavia
 */
public class TP02Ex2 {
  
    static void Calculo(){
    Scanner scan = new Scanner(System.in);
        double num,maior = 0,aux = 0, soma = 0,media;
        for(int i= 0 ; i < 10; i++){
            System.out.println("Digite um valor positivo");
            num = scan.nextDouble();
            while(num < 0){
                System.out.println("Corrija para um valor positivo");
                num = scan.nextDouble();
                }
            soma = soma + num;
            if(aux < num){
             maior = num;
            }
            aux = num;
        }
        media = soma/10;
        System.out.println("A soma dos numeros é: " + soma + "O maior numero é: " + maior + "a media é: " + media);
    }
    public static void main(String[] args) {
     Calculo();   
    }        
}  
