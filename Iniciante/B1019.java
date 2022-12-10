/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.*/


import java.util.Scanner;

public class Main{
    
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	   
	    int N, HORA, MIN,SEG;
	    
	    N = teclado.nextInt();
	    
	    SEG = (N % 60);
	    MIN = (N/60 % 60);
	    HORA=(N/60)/60;
	    
		System.out.println(HORA+ ":" + df.format(MIN) + ":" + SEG);
	}
}

