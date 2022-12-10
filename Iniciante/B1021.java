/*Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.*/


import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);

	    double NOTA100,NOTA50,NOTA20,NOTA10,NOTA5,NOTA2;
	    double N,MOEDA1,MOEDA050, MOEDA025,MOEDA010,MOEDA05,MOEDA01;
	    
	    N = teclado.nextDouble(); 
	    
	    NOTA100 = (N/100); 
	    NOTA50  = (N % 100 )/50;
	    NOTA20  = (N % 100 % 50)/20;
	    NOTA10  = (N % 100 % 50 % 20)/10;
	    NOTA5   = (N % 100 % 50 % 20 % 10)/5;
	    NOTA2   = (N % 100 % 50 % 20 % 10 % 5)/2;
	    
	
	    MOEDA1   = (N % 100 % 50 % 20 % 10 % 5 % 2)/1;
	    N = (N * 100) - ((int) N)*100; 
	    MOEDA050 = ( N / 50);
	    MOEDA025 = (N % 50)/25;
	    MOEDA010 = (N % 50 % 25)/10;
	    MOEDA05  = (N % 50 % 25 % 10)/ 5;
	    MOEDA01 = (N % 50 % 25 % 10 % 5)/1;
	  
		System.out.println("NOTAS:");
		System.out.println((int)NOTA100 +" nota(s) de R$ 100.00");
		System.out.println((int)NOTA50 + " nota(s) de R$ 50.00");
		System.out.println((int)NOTA20 + " nota(s) de R$ 20.00");
    	System.out.println((int)NOTA10 + " nota(s) de R$ 10.00");
		System.out.println((int)NOTA5  + " nota(s) de R$ 5.00");
		System.out.println((int)NOTA2  + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println((int)MOEDA1   +" moeda(s) de R$ 1.00");
		System.out.println((int)MOEDA050 +" moeda(s) de R$ 0.50" );
		System.out.println((int)MOEDA025 +" moeda(s) de R$ 0.25");
		System.out.println((int)MOEDA010 +" moeda(s) de R$ 0.10");
		System.out.println((int)MOEDA05  +" moeda(s) de R$ 0.05");
		System.out.println((int)MOEDA01  +" moeda(s) de R$ 0.01");
	    
		
	}
}




