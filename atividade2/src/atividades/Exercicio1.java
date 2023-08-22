package atividades;

import java.util.Scanner;

public class Exercicio1 {
	

	  public static void main(String[] args) {
	    System.out.println("insira 2 numeros para fazer alguma operação ");
	    double numero1;
	    double numero2;
	    int escolha;

	    Scanner sc = new Scanner(System.in);
	      numero1 = sc.nextDouble();
	      numero2 = sc.nextDouble();


	       System.out.println("Qual operação você deseja realizar.");
	       System.out.println("1 - Adição");
	       System.out.println("2 - Subtração");
	       System.out.println("3 - Multiplicação");
	       System.out.println("4 - Divisão");
	       escolha = sc.nextInt();

	      switch(escolha){
	          case 1:
	            double soma = numero1 + numero2;
	            System.out.println("Resultado de adição: " + soma);
	            break;

	          case 2:
	            double subtracao = numero1 - numero2;
	            System.out.println("Resultado de subtracao: " + subtracao);
	            break;

	          case 3:
	            double multiplicacao = numero1 * numero2;
	            System.out.println("Resultado de multiplicação: " + multiplicacao);
	            break;

	          case 4:
	            if(numero2 !=0) {
	              double divisao = numero1 / numero2;
	            System.out.println("Resultado de divisao :" + divisao);
	            } else {
	              System.out.println("Não é possivél realizar nenhuma divisão sendo o divisor = 0");
	            }

	          break;
	        default:
	         System.out.println("Opção inválida.");
	      }
	      sc.close();
	    }

	  }

