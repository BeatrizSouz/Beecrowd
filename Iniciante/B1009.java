/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.*/




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




