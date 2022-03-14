/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubo;

import java.util.Scanner;

public class Cubo {

    public static void main(String[] args) {
	Scanner bm = new Scanner(System.in);
	
	int a, b, resposta;
        
	//o método nextInt() lê o valor digitado e o armazena em uma variável do tipo int
	a = bm.nextInt();
	b = bm.nextInt();
        
        // usando o método math.floor iremos arredondar o valor duplo especificado para baixo e o retornar
	int raiz_cubica = (int) Math.floor(Math.pow(a,1./3.));
	int cubo = raiz_cubica * raiz_cubica * raiz_cubica; //* operador de multiplicação 
	if (cubo < a) {   // raiz cubica pode ser menor do que a raiz cubica++
	    cubo = raiz_cubica * raiz_cubica * raiz_cubica;
	}

	//verificando se o número também é um quadrado, procurando por cubos entre a e b
	resposta = 0;
	while (cubo <= b) { // 
	    int raiz_quadrada = (int) Math.floor(Math.sqrt(cubo));
	    int quadrado = raiz_quadrada * raiz_quadrada;
	    if (quadrado == cubo) { // verificando se uma variável é igual a outra
		resposta++; //esse ++ é como se fosse x= x+1, lê o valor do indice no                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                //momento em que é chamado e depois incrementa esse valor.(só irá ter valor na proxima linha)
	    } 
	    raiz_cubica++;
	    cubo = raiz_cubica * raiz_cubica * raiz_cubica;
	}	
	System.out.println(resposta);
    }
}