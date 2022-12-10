/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar.
 tabela = https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1038_pt.png
Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. */

import java.util.Scanner;

public class main {

    public static void ValorTotal() {
        Scanner teclado = new Scanner(System.in);
        int Codigo = teclado.nextInt();
        int Qtde = teclado.nextInt();

        if (Codigo == 1) {
            float Valor = 4.00f * (float) Qtde;
            System.out.printf("Total: R$ %.2f", Valor);
        } else if (Codigo == 2) {
            float Valor = 4.50f * (float) Qtde;
            System.out.printf("Total: R$ %.2f", Valor);

        } else if (Codigo == 3) {
            float Valor = 5.00f * (float) Qtde;
            System.out.printf("Total: R$ %.2f", Valor);

        } else if (Codigo == 4) {
            float Valor = 2.00f * (float) Qtde;
            System.out.printf("Total: R$ %.2f", Valor);

        } else if (Codigo == 5) {
            float Valor = 1.50f * (float) Qtde;
            System.out.printf("Total: R$ %.2f", Valor);
        }

    }

    public static void main(String[] args) throws Exception {
        try {

            ValorTotal();

        } catch (java.util.InputMismatchException error) {
            System.out.println("Infome apenas um número!");
        }

    }
}
