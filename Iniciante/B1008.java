/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.*/



import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.00");
	    
	    String nome;
	    double salario, total;
	    
	    nome = teclado.nextLine();
	    salario = teclado.nextDouble();
	    total = teclado.nextDouble();
	    
	    total = (total * 0.15) + salario;
	    
	    System.out.println("TOTAL = R$ " + df.format(total) );
		
	}
}



