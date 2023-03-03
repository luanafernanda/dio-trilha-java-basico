package edu.luana.primeirasemana;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class ParEImpar {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int quantidadeNumeros;
    int contador = 0;
    int numero = 0;
    int quantidadePar = 0;
    int quantidadeImpar = 0;

    System.out.println("Digite a quantidade de números: ");
    quantidadeNumeros = leitor.nextInt();

    do {
      System.out.println("Digite um número: ");
      numero = leitor.nextInt();

      if (numero % 2 == 0) {
        quantidadePar++;
      } else {
        quantidadeImpar++;
      }
      contador++;
    } while (contador < quantidadeNumeros);

    System.out.println("A quantidade de números pares é: " + quantidadePar);
    System.out.println("A quantidade de números ímpares é: " + quantidadeImpar);

  }

}
