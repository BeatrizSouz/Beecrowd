/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	    DecimalFormat df = new DecimalFormat ("0.0");
	    int N, NOTA100, NOTA50, NOTA20,NOTA10,NOTA5,NOTA2,NOTA1;
	    
	    N = teclado.nextInt();
	    
	    NOTA100 = (N/100); 
	    NOTA50  = (N % 100 )/50;
	    NOTA20  = (N % 100 % 50)/20;
	    NOTA10  = (N % 100 % 50 % 20)/10;
	    NOTA5   = (N % 100 % 50 % 20 % 10)/5;
	    NOTA2   = (N % 100 % 50 % 20 % 10 % 5)/2;
	    NOTA1   = (N % 100 % 50 % 20 % 10 % 5 % 2)/1;
	
	  
		System.out.println(N);
		System.out.println(NOTA100 +" nota(s) de R$ 100,00");
		System.out.println(NOTA50 + " nota(s) de R$ 50,00");
		System.out.println(NOTA20 + " nota(s) de R$ 20,00");
    	System.out.println(NOTA10 + " nota(s) de R$ 10,00");
		System.out.println(NOTA5  + " nota(s) de R$ 5,00");
		System.out.println(NOTA2  + " nota(s) de R$ 2,00");
		System.out.println(NOTA1  + " nota(s) de R$ 1,00");
	}
}
