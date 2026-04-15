/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class TP02Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alexandre Zampieri Salles | Caio Andrade
        /**
         * Entrar via teclado com “N” valores quaisquer. O valor “N” (que
         * representa a quantidade de números) será digitado, deverá ser
         * positivo, porém menor que vinte. Caso a quantidade não satisfaça a
         * restrição, enviar mensagem de erro e solicitar o valor novamente.
         * Após a digitação dos “N” valores, exibir: a. O maior valor; b. O
         * menor valor; c. A soma dos valores; d. A média aritmética dos
         * valores; e. A porcentagem de valores que são positivos; f. A
         * porcentagem de valores negativos; Após exibir os dados, perguntar ao
         * usuário de deseja ou não uma nova execução do programa. Consistir a
         * resposta no sentido de aceitar somente “S” ou “N” e encerrar o
         * programa em função dessa resposta.
         */

        Scanner sc = new Scanner(System.in);

        double media, pPositivos, pNegativos, soma = 0;
        int tamanho, nPositivos = 0, nNegativos = 0;
        int[] numeros;

        System.out.println("Quantos numeros serão digitados? /n O valor deve ser positivo e menor que 20!!");
        tamanho = sc.nextInt();

        while (tamanho < 0 || tamanho > 20) {
            System.out.println("Valor digitado inválido! Digite novamente: /n O valor deve ser positivo e menor que 20!!");
            tamanho = sc.nextInt();
        }

        numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        int maior = numeros[0];
        int menor = numeros[0];

        // Percorre o array para encontrar os valores
       for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] > maior) {
        maior = numeros[i];
    }
    if (numeros[i] < menor) {
        menor = numeros[i];
    }

    if (numeros[i] > 0) {
        nPositivos++;
    } else if (numeros[i] < 0) {
        nNegativos++;
    }
}
        
        media = soma / tamanho;
        pPositivos = (nPositivos * 100) / tamanho;
        pNegativos = (nNegativos * 100) / tamanho;

        System.out.println("a. O maior valor: " + maior);
        System.out.println("b. O menor valor: " + menor);
        System.out.println("c. A soma valor: " + soma);
        System.out.println("d. A media valor: " + media);
        System.out.println("e. % de numeros positivos: " + pPositivos+"%");
        System.out.println("f. % de numeros negativos: " + pNegativos+"%");


    }

}