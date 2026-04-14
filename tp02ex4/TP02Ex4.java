/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex4;
    /*Nomes: Caio Andrade, Alexandre Zampieri
      Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
    */
/**
 *
 * @author cavia
 */
public class TP02Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] numeros = {
        {2,55,54},
        {4,27,80}
        };
       for(int i = 0; i < numeros.length;i++){
           for(int j = 0; j< numeros[i].length;j++){
               System.out.println(numeros[i][j]);
           }
       }
    }
    
}
