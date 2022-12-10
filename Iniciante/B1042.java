/*Leia 3 valores inteiros e ordene-os em ordem crescente. 
No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.*/

import java.util.Scanner;
public class Main{
    
    public static void imprimirEmOrdem(int A, int B, int C) {
        if (A < B){
            
	       if (A < C){
	            
	           if (B < C) {
	               System.out.println(A);
	               System.out.println(B);
	               System.out.println(C);
	           }else{
	               System.out.println(A);
	               System.out.println(C);
	               System.out.println(B);
	           }
	           
	       }else{
	           System.out.println(C);
	           System.out.println(A);
	           System.out.println(B);   
	        }  
	        
	    }else{
	        if (B < C){
	            if (A < C){
	               System.out.println(B);
	               System.out.println(A);
	               System.out.println(C); 
	            }else{
	               System.out.println(B);
	               System.out.println(C);
	               System.out.println(A); 
	            }
	            
	        }else{
	           System.out.println(C);
	           System.out.println(B);
	           System.out.println(A);
	        } 
	        
	    }
	    
	    System.out.println();
	    System.out.println(A);
	    System.out.println(B);
	    System.out.println(C);
	    
	

        
        
    }
    
    
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int A, B ,C ;

	    A = teclado.nextInt();
	    B = teclado.nextInt();
	    C = teclado.nextInt();
	    
	    
	    
	    imprimirEmOrdem(A,B,C);
	   
    }

}