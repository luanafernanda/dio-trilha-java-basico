package edu.luana.primeirasemana;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 1 e 100)
 * armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
  public static void main(String[] args) {
    Random aleatorio = new Random();

    int[] NumerosAleatorios = new int[20];

    for (int i = 0; i < NumerosAleatorios.length; i++) {
      int numero = aleatorio.nextInt(100);
      NumerosAleatorios[i] = numero;
    }

    System.out.println("Números aleatórios: ");
    for (int numero : NumerosAleatorios) {
      System.out.print(numero + " - ");
    }

    System.out.println("\nSucessores dos números aleatórios: ");
    for (int numero : NumerosAleatorios) {
      System.out.print((numero + 1) + " - ");
    }
  }
}
