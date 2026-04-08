/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex6;
    /*Nomes: Caio Andrade, Alexandre Zampieri
        6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
    */
/**
 *
 * @author cavia
 */
public class TP02Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[][] nomes= {
 {"Caio", "Alexandre", "Pedro"},
 {"Guilherme", "Joao","Yuri"}
 };
        for(int i = 0; i < nomes.length;i++){
           for(int j = 0; j< nomes[i].length;j++){
               System.out.println(nomes[i][j]);
           }
       }
    }
    
}
