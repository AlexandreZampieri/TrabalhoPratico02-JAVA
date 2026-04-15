/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex7;

import java.util.Locale;
import java.util.Scanner;

/*
    Nomes: Caio Andrade, Alexandre Zampieri
7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*/
/**
 *
 * @author cavia
 */
public class TP02Ex7 {

    /**
     * @param args the command line arguments
     */
     public static void CriaMatriz() {
        double[][] numeros = new double[3][4];

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um valor para a matriz [" + i + "][" + j + "]: ");
                numeros[i][j] = scan.nextDouble();
            }
        }

       
        System.out.println("Digite uma constante multiplicativa:");
        double num = scan.nextDouble();

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = numeros[i][j] * num;
            }
        }

        System.out.println("Matriz após multiplicação:");
        MostraMatriz(numeros);
    }

    public static void MostraMatriz(double[][] numeros) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CriaMatriz();
    }
    
}
