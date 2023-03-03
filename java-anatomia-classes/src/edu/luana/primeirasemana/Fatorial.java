package edu.luana.primeirasemana;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * ex: 5!= 120 (5x4x3x2x1=120)
 */

public class Fatorial {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int numero;
    int multiplicacao = 1;

    System.out.println("Digite um número para saber seu fatorial:");
    numero = leitor.nextInt();

    for (int i = 0; i >= numero; i--) {
      multiplicacao = multiplicacao * 1;
    }
  }
}
