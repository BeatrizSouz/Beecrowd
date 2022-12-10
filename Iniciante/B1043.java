/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX,X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX,X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float A, B, C;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        verificarSeTriangulo(A, B, C);

    }

    private static void verificarSeTriangulo(float A, float B, float C) {
        if ((Math.abs(A - B) < C) && (A + B > C)) {
            if ((Math.abs(A - C) < B) && (A + C > B)) {
                if ((Math.abs(C - B) < A) && (C + B > A)) {
                    float perimetro = A + B + C;
                    System.out.printf("Perimetro = %.1f\n", perimetro);
                }
            }

        } else {
            float area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }

}