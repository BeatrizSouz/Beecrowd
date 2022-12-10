/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1015.png

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.*/



import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.0000");
	    double X2,X1,Y2,Y1, distancia;
	    
	   X1 = teclado.nextDouble();
	   Y1 = teclado.nextDouble();
	   X2 = teclado.nextDouble();
	   Y2 = teclado.nextDouble();
	   
	   distancia = Math.sqrt( Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)  );
	   
	    
		System.out.println(df.format(distancia) );
	}
}

