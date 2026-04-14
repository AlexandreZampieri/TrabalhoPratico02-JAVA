package tp02ex8;

import java.util.Scanner;
import java.util.Locale;

/*
Caio Andrade Alexandre Zampieri
8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
    correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
    colunas.
*/

public class TP02Ex8 {

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
        System.out.println("Digite uma constante multiplicativa pra essa matriz");
        double num = scan.nextDouble();
        
        double[][] numerosM = new double [3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numerosM[i][j] = num * numeros[i][j];
            }
        }
        
        System.out.println("Matriz original:");
        MostraMatriz(numeros);

        System.out.println("Matriz multiplicada:");
        MostraMatriz(numerosM);
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