package edu.luana.primeirasemana;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros
 * e informe o maior número 
 * e a média desses números.
 */
public class MaiorEMedia {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int numero;
    int maior = 0;
    int soma = 0;
    int media = 0;
    int contador = 0;
    do {
      System.out.println("Escreva um número: ");
      numero = leitor.nextInt();
      contador++;

      if (numero > maior) {
        maior = numero;
      }

      soma = soma + numero;
      media = soma / contador;
    } while (contador < 5);

    System.out.println("O maior número é: " + maior);
    System.out.println("A média dos números é: " + media);
  }

}
