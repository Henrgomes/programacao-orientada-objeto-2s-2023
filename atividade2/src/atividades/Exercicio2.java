package atividades;

import java.util.Scanner;

public class Exercicio2 {
	
	    public static void main(String[] args) {

	        double temp1 = 0;
	        int escolha;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("insira 1 temperatura e depois a conversão");
	        temp1 = sc.nextDouble();


	        System.out.println("Qual conversão você deseja realizar.");
	        System.out.println("1 - Celsius para Fahrenheit");
	        System.out.println("2 - Fahrenheit para Celsius");

	        escolha = sc.nextInt();
	        switch(escolha){
	            case 1:
	                double CparaF = ( temp1 * 5/9) + 32;
	                System.out.printf("A conversão fica: %.2f ", CparaF);
	                break;

	            case 2:
	                double FparaC = (temp1 - 32) * 5/9;
	                ;
	                System.out.printf("A conversão fica: %.2f ", FparaC);
	                break;

	            default:
	                System.out.println("Opção inválida.");
	                sc.close();
	                
	        }
	    }
}