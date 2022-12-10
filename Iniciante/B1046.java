/*Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int HrI = teclado.nextInt();
        int HrF = teclado.nextInt();
        teclado.close();

        if (HrI < HrF) {
            int Duracao = HrF - HrI;
            System.out.printf("O JOGO DUROU %d HORA(S)", Duracao);
        } else if (HrI >= HrF) {
            int Duracao = (24 - HrI) + HrF;
            System.out.printf("O JOGO DUROU %d HORA(S)", Duracao);
        }

    }
}
