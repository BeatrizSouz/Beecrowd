/*Leia 2 valores inteiros (A e B). 
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int A = tecla.nextInt();
        int B = tecla.nextInt();

        VerificarMultiplo(A, B);
    }

    private static void VerificarMultiplo(int A, int B) {
        if (A > B) {
            if (A % B == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (B > A) {
            if (B % A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}