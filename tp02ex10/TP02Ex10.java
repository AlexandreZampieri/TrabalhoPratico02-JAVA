package tp02ex10;

import java.util.Scanner;
import java.util.Locale;

/*
    Nomes: Caio Andrade, Alexandre Zampieri
    10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/
public class TP02Ex10 {

    public static void CriaMatriz() {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int M = 0;

        System.out.println("Digite um valor inteiro (no MAX 10) para M na matriz [M][M]");
        M = scan.nextInt();

        while (M > 10 || M <= 0) {
            System.out.println("Digite um valor entre 1 e 10");
            M = scan.nextInt();
        }

        double[][] numeros = new double[M][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Digite um valor para a matriz [" + i + "][" + j + "]: ");
                numeros[i][j] = scan.nextDouble();
            }
        }

        System.out.println("\nMatriz original:");
        MostraMatriz(numeros);

        double[][] inversa = CalculoInversa(numeros);

        if (inversa != null) {
            System.out.println("\nMatriz inversa:");
            MostraMatriz(inversa);
        }
    }

    public static double[][] CalculoInversa(double[][] numeros) {

        int n = numeros.length;

        double[][] a = new double[n][n];
        double[][] identidade = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = numeros[i][j];
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        for (int i = 0; i < n; i++) {

            double pivo = a[i][i];

            if (pivo == 0) {
                System.out.println("Não é possível calcular a inversa (pivô zero)");
                return null;
            }

            for (int j = 0; j < n; j++) {
                a[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double fator = a[k][i];

                    for (int j = 0; j < n; j++) {
                        a[k][j] -= fator * a[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        return identidade;
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
