/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
Imprima sempre o final de linha após cada mensagem.*/


import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Main{
    
    public static String FormulaBhaskara(){
            Scanner teclado = new Scanner(System.in);
    	    DecimalFormat df = new DecimalFormat("0.00000");
    	    
    	    double A,B,C, R1,R2, Delta;
    	    String  mensagem = null;
    	    R1 = 0;
    	    R2 = 0;
    	    A = teclado.nextDouble();
    	    B = teclado.nextDouble();
    	    C = teclado.nextDouble();
    	    
    	    Delta = (Math.pow(B,2)-4*A*C ) ;
    	    if (Delta < 0 || A == 0){
    	        mensagem = "Impossivel calcular"; 
    	    }else {
        	    R1 = ( (-B + Math.sqrt(Delta) )/(2*A) );
        	    R2 = ( (-B - Math.sqrt(Delta) )/(2*A) );  
        	    mensagem = ("R1 = "+df.format(R1) + "\n");
    		    mensagem +=("R2 = "+df.format(R2));
    	    }
    	    return mensagem; 
      }
    
	public static void main(String[] args) {
	    
	    System.out.println(FormulaBhaskara());
    

	}
}


