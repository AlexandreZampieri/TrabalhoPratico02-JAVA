package tp02ex9;

import java.util.Scanner;
import java.util.Locale;

/*Nomes: Caio Andrade, Alexandre Zampieri
9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/

public class TP02Ex9 {

    public static void CriaMatriz() {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int M, N;

        System.out.println("Digite o número de linhas (máx 10):");
        M = scan.nextInt();

        while (M <= 0 || M > 10) {
            System.out.println("Digite um valor entre 1 e 10:");
            M = scan.nextInt();
        }

        System.out.println("Digite o número de colunas (máx 10):");
        N = scan.nextInt();

        while (N <= 0 || N > 10) {
            System.out.println("Digite um valor entre 1 e 10:");
            N = scan.nextInt();
        }

        double[][] numeros = new double[M][N];

        // Entrada dos valores
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Digite um valor para [" + i + "][" + j + "]: ");
                numeros[i][j] = scan.nextDouble();
            }
        }

        System.out.println("\nMatriz original:");
        MostraMatriz(numeros);

        double[][] transposta = Transposta(numeros);

        System.out.println("\nMatriz transposta:");
        MostraMatriz(transposta);
    }

    public static double[][] Transposta(double[][] matriz) {

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        double[][] transposta = new double[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    public static void MostraMatriz(double[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CriaMatriz();
    }
}