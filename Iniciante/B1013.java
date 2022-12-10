/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
Utilize a fórmula!

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int A,B,C, maior ;
	    
	    A = teclado.nextInt(); 
	    B = teclado.nextInt();
	    C = teclado.nextInt();
	    
	    maior = (A + B + Math.abs(A - B) ) / 2;
	    
	    maior= (maior + C + Math.abs (maior - C) )/2;
	    
		System.out.println(maior + " eh o maior");
	}
}

